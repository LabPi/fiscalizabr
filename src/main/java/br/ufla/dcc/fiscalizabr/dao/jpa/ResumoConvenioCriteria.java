package br.ufla.dcc.fiscalizabr.dao.jpa;

import br.ufla.dcc.fiscalizabr.modelo.Convenio;
import br.ufla.dcc.fiscalizabr.modelo.Proponente;
import br.ufla.dcc.fiscalizabr.modelo.UF;
import br.ufla.dcc.fiscalizabr.modelo.Valor;
import java.util.HashMap;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Root;

public class ResumoConvenioCriteria {

    private final CriteriaBuilder cb;
    private final CriteriaQuery<Convenio> criteriaQuery;
    private final Root<Convenio> root;
    private final HashMap<String, String> mapaFiltro;

    public ResumoConvenioCriteria(HashMap<String, String> mf) {
        EntityManager entityManager = JPAUtil.getEMF().createEntityManager();
        cb = entityManager.getCriteriaBuilder();
        mapaFiltro = mf;
        criteriaQuery = cb.createQuery(Convenio.class);
        root = criteriaQuery.from(Convenio.class);
        criteriaQuery.select(root);
    }

    public ResumoConvenioCriteria comFaixaValores() {
        String minValorS = mapaFiltro.get("minValor");
        String maxValorS = mapaFiltro.get("maxValor");
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
        String municipio = mapaFiltro.get("mun");
        String uf = mapaFiltro.get("uf");
        if (!municipio.isEmpty() && !uf.isEmpty()) {
            Path<Proponente> pathProp = root.get("proponente");
            Path<String> pathMun = pathProp.get("municipio");
            Path<String> pathUf = pathProp.get("uf");
            criteriaQuery.where(cb.equal(pathMun, municipio), 
                    cb.equal(pathUf, UF.valueOf(uf)));
        }
        return this;
    }

    public CriteriaQuery<Convenio> getCriteriaQuery() {
        return criteriaQuery;
    }

}
