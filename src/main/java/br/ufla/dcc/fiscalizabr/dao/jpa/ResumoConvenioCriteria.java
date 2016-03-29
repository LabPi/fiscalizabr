package br.ufla.dcc.fiscalizabr.dao.jpa;

import br.ufla.dcc.fiscalizabr.modelo.Convenio;
import br.ufla.dcc.fiscalizabr.modelo.Proponente;
import br.ufla.dcc.fiscalizabr.modelo.ResumoConvenio;
import br.ufla.dcc.fiscalizabr.modelo.UF;
import br.ufla.dcc.fiscalizabr.modelo.Valor;
import br.ufla.dcc.fiscalizabr.rest.ConvenioResource;
import java.util.HashMap;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Root;

public class ResumoConvenioCriteria {

    private final CriteriaBuilder cb;
    private final CriteriaQuery<ResumoConvenio> criteriaQuery;
    private final Root<Convenio> root;
    private final HashMap<String, String> mapaFiltro;

    public ResumoConvenioCriteria(HashMap<String, String> mf) {
        EntityManager entityManager = JPAUtil.getEMF().createEntityManager();
        cb = entityManager.getCriteriaBuilder();
        mapaFiltro = mf;
        criteriaQuery = cb.createQuery(ResumoConvenio.class);
        root = criteriaQuery.from(Convenio.class);
        criteriaQuery.select(cb.construct(ResumoConvenio.class, 
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
            criteriaQuery.where(cb.ge(pathVg, minValorD), cb.le(pathVg, maxValorD));
        }
        return this;
    }

    public ResumoConvenioCriteria comLocalidade() {
        String municipio = mapaFiltro.get(ConvenioResource.MUNICIPIO_QUERY_PARAM_NAME);
        String uf = mapaFiltro.get(ConvenioResource.UF_QUERY_PARAM_NAME);
        if (!municipio.isEmpty() && !uf.isEmpty()) {
            Path<Proponente> pathProp = root.get("proponente");
            Path<String> pathMun = pathProp.get("municipio");
            Path<String> pathUf = pathProp.get("uf");
            criteriaQuery.where(cb.equal(pathMun, municipio), 
                    cb.equal(pathUf, UF.valueOf(uf)));
        }
        return this;
    }

    public CriteriaQuery<ResumoConvenio> getCriteriaQuery() {
        return criteriaQuery;
    }

}
