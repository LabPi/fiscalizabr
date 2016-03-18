package br.ufla.dcc.fiscalizabr.modelo;

import javax.persistence.Embeddable;

@Embeddable
public class OrgaoConcedente {
    private int numeroOrgaoConcedente;
    private String nomeOrgaoConcedente;

    public int getNumeroOrgaoConcedente() {
        return numeroOrgaoConcedente;
    }

    public void setNumeroOrgaoConcedente(int numeroOrgaoConcedente) {
        this.numeroOrgaoConcedente = numeroOrgaoConcedente;
    }

    public String getNomeOrgaoConcedente() {
        return nomeOrgaoConcedente;
    }

    public void setNomeOrgaoConcedente(String nomeOrgaoConcedente) {
        this.nomeOrgaoConcedente = nomeOrgaoConcedente;
    }

    
    
}
