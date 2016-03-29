package br.ufla.dcc.fiscalizabr.rest;

import br.ufla.dcc.fiscalizabr.dao.ConvenioDAO;
import br.ufla.dcc.fiscalizabr.dao.jpa.JPAConvenioDAO;
import br.ufla.dcc.fiscalizabr.modelo.Convenio;
import br.ufla.dcc.fiscalizabr.modelo.ResumoConvenio;
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

    public static final String NUMCONVENIO_PARAM_NAME = "numC";
    public static final String MUNICIPIO_QUERY_PARAM_NAME = "mun";
    public static final String UF_QUERY_PARAM_NAME = "uf";
    public static final String MINVALOR_QUERY_PARAM_NAME = "minV";
    public static final String MAXVALOR_QUERY_PARAM_NAME = "maxV";
    public static final String INIPERIODO_QUERY_PARAM_NAME = "iniPer";
    public static final String FIMPERIODO_QUERY_PARAM_NAME = "fimPer";
    public static final String SITUACAO_QUERY_PARAM_NAME = "sit";
    public static final String STR_DEFAULT_QUERY_PARAM_VALOR = "";

    private static final ConvenioDAO cDAO = new JPAConvenioDAO();

    @GET
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    public List<ResumoConvenio> obterConvenios(
            @DefaultValue(STR_DEFAULT_QUERY_PARAM_VALOR) @QueryParam(MUNICIPIO_QUERY_PARAM_NAME) String municipio,
            @DefaultValue(STR_DEFAULT_QUERY_PARAM_VALOR) @QueryParam(UF_QUERY_PARAM_NAME) String uf,
            @DefaultValue(STR_DEFAULT_QUERY_PARAM_VALOR) @QueryParam(MINVALOR_QUERY_PARAM_NAME) String minValor,
            @DefaultValue(STR_DEFAULT_QUERY_PARAM_VALOR) @QueryParam(MAXVALOR_QUERY_PARAM_NAME) String maxValor,
            @DefaultValue(STR_DEFAULT_QUERY_PARAM_VALOR) @QueryParam(INIPERIODO_QUERY_PARAM_NAME) String inicioPeriodo,
            @DefaultValue(STR_DEFAULT_QUERY_PARAM_VALOR) @QueryParam(FIMPERIODO_QUERY_PARAM_NAME) String fimPeriodo,
            @DefaultValue(STR_DEFAULT_QUERY_PARAM_VALOR) @QueryParam(SITUACAO_QUERY_PARAM_NAME) String status
    ) {
        HashMap<String, String> mapaFiltro = new HashMap<String, String>();
        mapaFiltro.put(MUNICIPIO_QUERY_PARAM_NAME, municipio);
        mapaFiltro.put(UF_QUERY_PARAM_NAME, uf);
        mapaFiltro.put(MINVALOR_QUERY_PARAM_NAME, minValor);
        mapaFiltro.put(MAXVALOR_QUERY_PARAM_NAME, maxValor);
        mapaFiltro.put(INIPERIODO_QUERY_PARAM_NAME, inicioPeriodo);
        mapaFiltro.put(FIMPERIODO_QUERY_PARAM_NAME, fimPeriodo);
        mapaFiltro.put(SITUACAO_QUERY_PARAM_NAME, status);
        return cDAO.todos(mapaFiltro);
    }

    @GET
    @Path("/{cId}")
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    public Convenio obterConvenio(@PathParam("cId") Long cId) {
        return cDAO.porId(cId);
    }
}
