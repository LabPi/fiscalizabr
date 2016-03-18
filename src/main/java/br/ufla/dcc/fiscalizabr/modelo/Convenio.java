package br.ufla.dcc.fiscalizabr.modelo;

import java.io.Serializable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = Convenio.TODOS, query = "select c from Convenio c")
public class Convenio implements Serializable {
    public static final String TODOS = "Convenio.TODOS";
    @Id @GeneratedValue
    private Long id;
    private int anoConvenio;
    private int numeroConvenio;
    @Embedded
    private Proposta proposta;
    @Enumerated(EnumType.STRING)
    private Modalidade modalidade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAnoConvenio() {
        return anoConvenio;
    }

    public void setAnoConvenio(int anoConvenio) {
        this.anoConvenio = anoConvenio;
    }

    public int getNumeroConvenio() {
        return numeroConvenio;
    }

    public void setNumeroConvenio(int numeroConvenio) {
        this.numeroConvenio = numeroConvenio;
    }

    public Proposta getProposta() {
        return proposta;
    }

    public void setProposta(Proposta proposta) {
        this.proposta = proposta;
    }

    public Modalidade getModalidade() {
        return modalidade;
    }

    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }
    
    
}
