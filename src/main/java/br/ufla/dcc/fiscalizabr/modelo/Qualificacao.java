package br.ufla.dcc.fiscalizabr.modelo;

import java.io.Serializable;

public enum Qualificacao implements Serializable {

    BEFICIARIO_EMENDA_PARLAMENTAR("Beneficiário de emenda parlamentar"),
    BENEFICIARIO_ESPECIFICO("Beneficiário específico"),
    REPASSE_VOLUNTARIO("Repasse voluntário");

    private final String descricao;

    private Qualificacao(String desc) {
        this.descricao = desc;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
