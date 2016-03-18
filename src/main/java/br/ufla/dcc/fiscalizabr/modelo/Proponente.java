package br.ufla.dcc.fiscalizabr.modelo;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
public class Proponente implements Serializable {

    @Enumerated(EnumType.STRING)
    private EsferaAdministrativa esferaAdministrativa;
    @Enumerated(EnumType.STRING)
    private Regiao regiao;
    @Enumerated(EnumType.STRING)
    private UF uf;
    @Enumerated(EnumType.STRING)
    private Qualificacao qualificacao;
    private String municipio;
    private String numeroProponente;
    private String nomeProponente;
    private String enderecoProponente;
    private String bairroProponente;
    private String cepProponente;
    private String numeroResponsavelProponente;
    private String nomeResponsavelProponente;
    private String cargoResponsavelProponente;

    public EsferaAdministrativa getEsferaAdministrativa() {
        return esferaAdministrativa;
    }

    public void setEsferaAdministrativa(EsferaAdministrativa esferaAdministrativa) {
        this.esferaAdministrativa = esferaAdministrativa;
    }

    public Regiao getRegiao() {
        return regiao;
    }

    public void setRegiao(Regiao regiao) {
        this.regiao = regiao;
    }

    public UF getUf() {
        return uf;
    }

    public void setUf(UF uf) {
        this.uf = uf;
    }

    public Qualificacao getQualificacao() {
        return qualificacao;
    }

    public void setQualificacao(Qualificacao qualificacao) {
        this.qualificacao = qualificacao;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getNumeroProponente() {
        return numeroProponente;
    }

    public void setNumeroProponente(String numeroProponente) {
        this.numeroProponente = numeroProponente;
    }

    public String getNomeProponente() {
        return nomeProponente;
    }

    public void setNomeProponente(String nomeProponente) {
        this.nomeProponente = nomeProponente;
    }

    public String getEnderecoProponente() {
        return enderecoProponente;
    }

    public void setEnderecoProponente(String enderecoProponente) {
        this.enderecoProponente = enderecoProponente;
    }

    public String getBairroProponente() {
        return bairroProponente;
    }

    public void setBairroProponente(String bairroProponente) {
        this.bairroProponente = bairroProponente;
    }

    public String getCepProponente() {
        return cepProponente;
    }

    public void setCepProponente(String cepProponente) {
        this.cepProponente = cepProponente;
    }

    public String getNumeroResponsavelProponente() {
        return numeroResponsavelProponente;
    }

    public void setNumeroResponsavelProponente(String numeroResponsavelProponente) {
        this.numeroResponsavelProponente = numeroResponsavelProponente;
    }

    public String getNomeResponsavelProponente() {
        return nomeResponsavelProponente;
    }

    public void setNomeResponsavelProponente(String nomeResponsavelProponente) {
        this.nomeResponsavelProponente = nomeResponsavelProponente;
    }

    public String getCargoResponsavelProponente() {
        return cargoResponsavelProponente;
    }

    public void setCargoResponsavelProponente(String cargoResponsavelProponente) {
        this.cargoResponsavelProponente = cargoResponsavelProponente;
    }

    

}
