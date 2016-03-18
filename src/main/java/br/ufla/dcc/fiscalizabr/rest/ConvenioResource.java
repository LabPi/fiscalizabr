package br.ufla.dcc.fiscalizabr.rest;

import br.ufla.dcc.fiscalizabr.dao.jpa.JPAUtil;
import br.ufla.dcc.fiscalizabr.modelo.Convenio;
import br.ufla.dcc.fiscalizabr.modelo.ResumoConvenio;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("convenios")
public class ConvenioResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    public List<ResumoConvenio> obterConvenios() {
        EntityManager em = JPAUtil.getEMF().createEntityManager();
        TypedQuery<ResumoConvenio> tp = em.createNamedQuery(Convenio.TODOS, ResumoConvenio.class);
        List<ResumoConvenio> convenios = tp.getResultList();        
        em.close();
        return convenios;
    }
}
