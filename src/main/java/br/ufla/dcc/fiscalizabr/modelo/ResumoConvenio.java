package br.ufla.dcc.fiscalizabr.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

public class ResumoConvenio implements Serializable {

    private String objeto;
    private Date inicioVigencia;
    private Date fimVigencia;
    private String municipio;
    private UF uf;
    private String nomeProponente;
    private BigDecimal valorGlobal;

    public ResumoConvenio() {
       this.objeto = "";
        this.inicioVigencia = Calendar.getInstance().getTime();
        this.fimVigencia = Calendar.getInstance().getTime();
        this.municipio = "";
        this.uf = UF.AC;
        this.nomeProponente = "";
        this.valorGlobal = new BigDecimal(0); 
    }
    
    public ResumoConvenio(String objeto, Date inicioVigencia, Date fimVigencia, String municipio, UF uf, String nomeProponente, BigDecimal valorGlobal) {
        this.objeto = objeto;
        this.inicioVigencia = inicioVigencia;
        this.fimVigencia = fimVigencia;
        this.municipio = municipio;
        this.uf = uf;
        this.nomeProponente = nomeProponente;
        this.valorGlobal = valorGlobal;
    }

    public String getObjeto() {
        return objeto;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }

    public Date getInicioVigencia() {
        return inicioVigencia;
    }

    public void setInicioVigencia(Date inicioVigencia) {
        this.inicioVigencia = inicioVigencia;
    }

    public Date getFimVigencia() {
        return fimVigencia;
    }

    public void setFimVigencia(Date fimVigencia) {
        this.fimVigencia = fimVigencia;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public UF getUf() {
        return uf;
    }

    public void setUf(UF uf) {
        this.uf = uf;
    }

    public String getNomeProponente() {
        return nomeProponente;
    }

    public void setNomeProponente(String nomeProponente) {
        this.nomeProponente = nomeProponente;
    }

    public BigDecimal getValorGlobal() {
        return valorGlobal;
    }

    public void setValorGlobal(BigDecimal valorGlobal) {
        this.valorGlobal = valorGlobal;
    }

}
