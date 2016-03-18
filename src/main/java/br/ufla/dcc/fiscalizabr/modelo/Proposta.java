package br.ufla.dcc.fiscalizabr.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class Proposta implements Serializable {
    
    @Column(name = "ANO_PROPOSTA")
    private int anoProposta;
    
    @Column(name = "NR_PROPOSTA")
    private int numeroProposta;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "DT_INCLUSAO_PROPOSTA")
    private Date dataInclusaoProposta;
    
    @Column(name = "ID_PROP")
    private int identificacaoProposta;    

    public int getAnoProposta() {
        return anoProposta;
    }

    public void setAnoProposta(int anoProposta) {
        this.anoProposta = anoProposta;
    }

    public int getNumeroProposta() {
        return numeroProposta;
    }

    public void setNumeroProposta(int numeroProposta) {
        this.numeroProposta = numeroProposta;
    }

    public Date getDataInclusaoProposta() {
        return dataInclusaoProposta;
    }

    public void setDataInclusaoProposta(Date dataInclusaoProposta) {
        this.dataInclusaoProposta = dataInclusaoProposta;
    }

    public int getIdentificacaoProposta() {
        return identificacaoProposta;
    }

    public void setIdentificacaoProposta(int identificacaoProposta) {
        this.identificacaoProposta = identificacaoProposta;
    } 
    
}
