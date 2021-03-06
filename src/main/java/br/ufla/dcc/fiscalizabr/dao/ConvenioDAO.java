package br.ufla.dcc.fiscalizabr.dao;

import br.ufla.dcc.fiscalizabr.modelo.Convenio;
import br.ufla.dcc.fiscalizabr.modelo.ResumoConvenio;
import java.util.HashMap;
import java.util.List;

public interface ConvenioDAO {
    public List<ResumoConvenio> todos(HashMap<String, String> mapaFiltro);
    public Convenio porNumero(int nConv);    
}
