package br.ufla.dcc.fiscalizabr.rest;

import br.ufla.dcc.fiscalizabr.dao.ConvenioDAO;
import br.ufla.dcc.fiscalizabr.dao.jpa.JPAConvenioDAO;
import br.ufla.dcc.fiscalizabr.modelo.Convenio;
import java.util.HashMap;
import java.util.List;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("convenios")
public class ConvenioResource {

    private static final ConvenioDAO cDAO = new JPAConvenioDAO();

    @GET
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    public List<Convenio> obterConvenios(
            @DefaultValue("") @QueryParam("mun") String municipio,
            @DefaultValue("") @QueryParam("uf") String uf,
            @DefaultValue("") @QueryParam("minValor") String minValor,
            @DefaultValue("") @QueryParam("maxValor") String maxValor
    ) {
        HashMap<String, String> mapaFiltro = new HashMap<String, String>();
        mapaFiltro.put("mun", municipio);
        mapaFiltro.put("uf", uf);
        mapaFiltro.put("minValor", minValor);
        mapaFiltro.put("maxValor", maxValor);
        return cDAO.todos(mapaFiltro);
    }

    @GET
    @Path("/{cId}")
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    public Convenio obterConvenio(@PathParam("cId") Long cId) {
        return cDAO.porId(cId);
    }

}
