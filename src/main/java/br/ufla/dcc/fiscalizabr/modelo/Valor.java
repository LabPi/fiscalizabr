package br.ufla.dcc.fiscalizabr.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Embeddable;

@Embeddable
public class Valor implements Serializable {
    private BigDecimal valorGlobal;
    private BigDecimal valorRepasseUniao;
    private BigDecimal valorTotalContrapartida;
    private BigDecimal valorContrapartidaFinanceira;
    private BigDecimal valorContrapartidaFinanceiraBensEServicos;
    private BigDecimal valorDesembolsado;
    private BigDecimal valorEmpenhado;

    public BigDecimal getValorGlobal() {
        return valorGlobal;
    }

    public void setValorGlobal(BigDecimal valorGlobal) {
        this.valorGlobal = valorGlobal;
    }

    public BigDecimal getValorRepasseUniao() {
        return valorRepasseUniao;
    }

    public void setValorRepasseUniao(BigDecimal valorRepasseUniao) {
        this.valorRepasseUniao = valorRepasseUniao;
    }

    public BigDecimal getValorTotalContrapartida() {
        return valorTotalContrapartida;
    }

    public void setValorTotalContrapartida(BigDecimal valorTotalContrapartida) {
        this.valorTotalContrapartida = valorTotalContrapartida;
    }

    public BigDecimal getValorContrapartidaFinanceira() {
        return valorContrapartidaFinanceira;
    }

    public void setValorContrapartidaFinanceira(BigDecimal valorContrapartidaFinanceira) {
        this.valorContrapartidaFinanceira = valorContrapartidaFinanceira;
    }

    public BigDecimal getValorContrapartidaFinanceiraBensEServicos() {
        return valorContrapartidaFinanceiraBensEServicos;
    }

    public void setValorContrapartidaFinanceiraBensEServicos(BigDecimal valorContrapartidaFinanceiraBensEServicos) {
        this.valorContrapartidaFinanceiraBensEServicos = valorContrapartidaFinanceiraBensEServicos;
    }

    public BigDecimal getValorDesembolsado() {
        return valorDesembolsado;
    }

    public void setValorDesembolsado(BigDecimal valorDesembolsado) {
        this.valorDesembolsado = valorDesembolsado;
    }

    public BigDecimal getValorEmpenhado() {
        return valorEmpenhado;
    }

    public void setValorEmpenhado(BigDecimal valorEmpenhado) {
        this.valorEmpenhado = valorEmpenhado;
    }
    
    
    

}