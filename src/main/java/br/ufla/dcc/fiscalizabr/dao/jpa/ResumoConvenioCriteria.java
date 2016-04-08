package br.ufla.dcc.fiscalizabr.dao.jpa;

import br.ufla.dcc.fiscalizabr.modelo.Convenio;
import br.ufla.dcc.fiscalizabr.modelo.Proponente;
import br.ufla.dcc.fiscalizabr.modelo.ResumoConvenio;
import br.ufla.dcc.fiscalizabr.modelo.SituacaoConvenio;
import br.ufla.dcc.fiscalizabr.modelo.UF;
import br.ufla.dcc.fiscalizabr.modelo.Valor;
import br.ufla.dcc.fiscalizabr.rest.ConvenioResource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class ResumoConvenioCriteria {

    private final CriteriaBuilder cb;
    private final CriteriaQuery<ResumoConvenio> criteriaQuery;
    private final Root<Convenio> root;
    private final HashMap<String, String> mapaFiltro;
    private final List<Predicate> predList;

    public ResumoConvenioCriteria(HashMap<String, String> mf) {
        EntityManager entityManager = JPAUtil.getEMF().createEntityManager();
        cb = entityManager.getCriteriaBuilder();
        predList = new ArrayList<Predicate>();
        mapaFiltro = mf;
        criteriaQuery = cb.createQuery(ResumoConvenio.class);
        root = criteriaQuery.from(Convenio.class);
        criteriaQuery.select(cb.construct(ResumoConvenio.class,
                root.get("numeroConvenio"), root.get("situacaoConvenio"),
                root.get("objeto"), root.get("inicioVigencia"),
                root.get("fimVigencia"), root.get("proponente").get("municipio"),
                root.get("proponente").get("uf"),
                root.get("proponente").get("nomeProponente"),
                root.get("valor").get("valorGlobal")));
    }

    public ResumoConvenioCriteria comFaixaValores() {
        String minValorS = mapaFiltro.get(ConvenioResource.MINVALOR_QUERY_PARAM_NAME);
        String maxValorS = mapaFiltro.get(ConvenioResource.MAXVALOR_QUERY_PARAM_NAME);
        if (!minValorS.isEmpty() && !maxValorS.isEmpty()) {
            double minValorD = Double.parseDouble(minValorS);
            double maxValorD = Double.parseDouble(maxValorS);
            Path<Valor> pathValor = root.get("valor");
            Path pathVg = pathValor.get("valorGlobal");
            predList.add(cb.ge(pathVg, minValorD));
            predList.add(cb.le(pathVg, maxValorD));
        }
        return this;
    }

    public ResumoConvenioCriteria comIntervaloData() {
        String inicioPeriodoS = mapaFiltro.get(ConvenioResource.INIPERIODO_QUERY_PARAM_NAME);
        String fimPeriodoS = mapaFiltro.get(ConvenioResource.FIMPERIODO_QUERY_PARAM_NAME);
        if (!inicioPeriodoS.isEmpty() && !fimPeriodoS.isEmpty()) {
            try {
                SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                Date inicioPeriodoD = df.parse(inicioPeriodoS);
                Date fimPeriodoD = df.parse(fimPeriodoS);

                Path<Date> pathDataAssinatura = root.get("dataAssinatura");
                predList.add(cb.between(pathDataAssinatura, inicioPeriodoD, fimPeriodoD));

            } catch (Exception ex) {
                ex.printStackTrace();
                return this;
            }
        }
        return this;
    }

    public ResumoConvenioCriteria comSituacao() {
        String situacao = mapaFiltro.get(ConvenioResource.SITUACAO_QUERY_PARAM_NAME);
        if (!situacao.isEmpty()) {
            Path<SituacaoConvenio> pathSituacao = root.get("situacaoConvenio");
            predList.add(cb.equal(pathSituacao, SituacaoConvenio.valueOf(situacao)));
        }
        return this;
    }

    public ResumoConvenioCriteria comLocalidade() {
        String municipio = mapaFiltro.get(ConvenioResource.MUNICIPIO_QUERY_PARAM_NAME);
        String uf = mapaFiltro.get(ConvenioResource.UF_QUERY_PARAM_NAME);
        if (!municipio.isEmpty() && !uf.isEmpty()) {
            Path<Proponente> pathProp = root.get("proponente");
            Path<String> pathMun = pathProp.get("municipio");
            Path<UF> pathUf = pathProp.get("uf");
            predList.add(cb.equal(pathMun, municipio));
            predList.add(cb.equal(pathUf, UF.valueOf(uf)));
        }
        return this;
    }

    public CriteriaQuery<ResumoConvenio> getCriteriaQuery() {
        Predicate[] predArray = new Predicate[predList.size()];
        criteriaQuery.where(predArray);
        return criteriaQuery;
    }

}
