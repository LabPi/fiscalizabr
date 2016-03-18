package br.ufla.dcc.fiscalizabr.modelo;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class OrgaoSuperior implements Serializable {
    private int numeroOrgaoSuperior;
    private String nomeOrgaoSuperior;

    public int getNumeroOrgaoSuperior() {
        return numeroOrgaoSuperior;
    }

    public void setNumeroOrgaoSuperior(int numeroOrgaoSuperior) {
        this.numeroOrgaoSuperior = numeroOrgaoSuperior;
    }

    public String getNomeOrgaoSuperior() {
        return nomeOrgaoSuperior;
    }

    public void setNomeOrgaoSuperior(String nomeOrgaoSuperior) {
        this.nomeOrgaoSuperior = nomeOrgaoSuperior;
    }
    
}
