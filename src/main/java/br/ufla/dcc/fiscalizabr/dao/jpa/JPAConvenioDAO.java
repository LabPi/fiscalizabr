package br.ufla.dcc.fiscalizabr.dao.jpa;

import br.ufla.dcc.fiscalizabr.dao.ConvenioDAO;
import br.ufla.dcc.fiscalizabr.modelo.Convenio;
import br.ufla.dcc.fiscalizabr.modelo.ResumoConvenio;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class JPAConvenioDAO implements ConvenioDAO, Serializable {

    @Override
    public List<ResumoConvenio> todos(HashMap mapaFiltro) {
        List<ResumoConvenio> convenios = new ArrayList<ResumoConvenio>();
        EntityManager em = JPAUtil.getEMF().createEntityManager();
        try {
            ResumoConvenioCriteria rcc
                    = new ResumoConvenioCriteria(mapaFiltro).
                    comLocalidade().comFaixaValores();
            TypedQuery<ResumoConvenio> tp = em.createQuery(rcc.getCriteriaQuery());          
            convenios = tp.getResultList();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            em.close();
            return convenios;
        }
    }

    @Override
    public Convenio porId(Long cId) {
        EntityManager em = JPAUtil.getEMF().createEntityManager();
        Convenio convenio = null;
        try {
            convenio = em.find(Convenio.class, cId);
        } finally {
            em.close();
            return convenio;
        }
    }

}
