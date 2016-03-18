package br.ufla.dcc.fiscalizabr.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
public class Proponente implements Serializable {

    @Enumerated(EnumType.STRING)
    @Column(name = "TX_ESFERA_ADM_PROPONENTE")
    private EsferaAdministrativa esferaAdministrativa;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "TX_REGIAO_PROPONENTE")
    private Regiao regiao;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "UF_PROPONENTE")
    private UF uf;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "TX_QUALIFIC_PROPONENTE")
    private Qualificacao qualificacao;
    
    @Column(name = "NM_MUNICIPIO_PROPONENTE")
    private String municipio;
    
    @Column(name = "CD_IDENTIF_PROPONENTE")
    private String identificacaoProponente;
    
    @Column(name = "NM_PROPONENTE")
    private String nomeProponente;
    
    @Column(name = "TX_ENDERECO_PROPONENTE")
    private String enderecoProponente;
    
    @Column(name = "TX_BAIRRO_PROPONENTE")
    private String bairroProponente;
    
    @Column(name = "NR_CEP_PROPONENTE")
    private String cepProponente;
    
    @Column(name = "CD_RESPONS_PROPONENTE")
    private String codigoResponsavelProponente;
    
    @Column(name = "NM_RESPONS_PROPONENTE")
    private String nomeResponsavelProponente;
    
    @Column(name = "TX_CARGO_RESPONS_PROPONENTE")
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

    public String getIdentificacaoProponente() {
        return identificacaoProponente;
    }

    public void setIdentificacaoProponente(String identificacaoProponente) {
        this.identificacaoProponente = identificacaoProponente;
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

    public String getCodigoResponsavelProponente() {
        return codigoResponsavelProponente;
    }

    public void setCodigoResponsavelProponente(String codigoResponsavelProponente) {
        this.codigoResponsavelProponente = codigoResponsavelProponente;
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
