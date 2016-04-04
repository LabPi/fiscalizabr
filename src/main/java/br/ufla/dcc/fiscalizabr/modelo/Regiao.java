package br.ufla.dcc.fiscalizabr.modelo;

import java.io.Serializable;

public enum Regiao implements Serializable {

    SUDESTE("Sudeste"),
    CENTRO_OESTE("Centro-Oeste"),
    NORDESTE("Nordeste"),
    NORTE("Norte"),
    SUL("Sul");
    
    private final String descricao;

    private Regiao(String desc) {
        this.descricao = desc;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
