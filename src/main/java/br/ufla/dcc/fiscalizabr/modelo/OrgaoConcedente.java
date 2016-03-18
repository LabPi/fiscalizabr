package br.ufla.dcc.fiscalizabr.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class OrgaoConcedente implements Serializable {

    @Column(name = "CD_ORGAO_CONCEDENTE")
    private int codigoOrgaoConcedente;
    
    @Column(name = "NM_ORGAO_CONCEDENTE")
    private String nomeOrgaoConcedente;
    
    @Column(name = "CD_RESPONS_CONCEDENTE")
    private String codigoResponsavelConcedente;
    
    @Column(name = "NM_RESPONS_CONCEDENTE")
    private String nomeResponsavelConcedente;
    
    @Column(name = "TX_CARGO_RESPONS_CONCEDENTE")
    private String cargoResponsavelConcedente;

    public int getCodigoOrgaoConcedente() {
        return codigoOrgaoConcedente;
    }

    public void setCodigoOrgaoConcedente(int codigoOrgaoConcedente) {
        this.codigoOrgaoConcedente = codigoOrgaoConcedente;
    }

    public String getNomeOrgaoConcedente() {
        return nomeOrgaoConcedente;
    }

    public void setNomeOrgaoConcedente(String nomeOrgaoConcedente) {
        this.nomeOrgaoConcedente = nomeOrgaoConcedente;
    }

    public String getCodigoResponsavelConcedente() {
        return codigoResponsavelConcedente;
    }

    public void setCodigoResponsavelConcedente(String codigoResponsavelConcedente) {
        this.codigoResponsavelConcedente = codigoResponsavelConcedente;
    }

    public String getNomeResponsavelConcedente() {
        return nomeResponsavelConcedente;
    }

    public void setNomeResponsavelConcedente(String nomeResponsavelConcedente) {
        this.nomeResponsavelConcedente = nomeResponsavelConcedente;
    }

    public String getCargoResponsavelConcedente() {
        return cargoResponsavelConcedente;
    }

    public void setCargoResponsavelConcedente(String cargoResponsavelConcedente) {
        this.cargoResponsavelConcedente = cargoResponsavelConcedente;
    }

    
}
