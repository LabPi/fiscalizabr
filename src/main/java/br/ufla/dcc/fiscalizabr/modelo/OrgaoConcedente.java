package br.ufla.dcc.fiscalizabr.modelo;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class OrgaoConcedente implements Serializable {

    private int numeroOrgaoConcedente;
    private String nomeOrgaoConcedente;
    private String numeroResponsavelConcedente;
    private String nomeResponsavelConcedente;
    private String cargoResponsavelConcedente;

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

    public String getNumeroResponsavelConcedente() {
        return numeroResponsavelConcedente;
    }

    public void setNumeroResponsavelConcedente(String numeroResponsavelConcedente) {
        this.numeroResponsavelConcedente = numeroResponsavelConcedente;
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
