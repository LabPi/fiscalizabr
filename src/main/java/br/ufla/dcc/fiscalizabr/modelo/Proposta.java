package br.ufla.dcc.fiscalizabr.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Embeddable;

@Embeddable
public class Proposta implements Serializable {
    private int anoProposta;
    private int numeroProposta;
    private Date dataInclusaoProposta;
    
    
    
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
}
