package br.ufla.dcc.fiscalizabr.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class OrgaoSuperior implements Serializable {
    
    @Column(name = "CD_ORGAO_SUPERIOR")
    private int codigoOrgaoSuperior;
    
    @Column(name = "NM_ORGAO_SUPERIOR")
    private String nomeOrgaoSuperior;

    public int getCodigoOrgaoSuperior() {
        return codigoOrgaoSuperior;
    }

    public void setCodigoOrgaoSuperior(int codigoOrgaoSuperior) {
        this.codigoOrgaoSuperior = codigoOrgaoSuperior;
    }

    public String getNomeOrgaoSuperior() {
        return nomeOrgaoSuperior;
    }

    public void setNomeOrgaoSuperior(String nomeOrgaoSuperior) {
        this.nomeOrgaoSuperior = nomeOrgaoSuperior;
    }

    
}
