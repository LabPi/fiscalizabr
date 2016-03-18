/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufla.dcc.fiscalizabr.modelo;

import java.io.Serializable;

/**
 *
 * @author Paulo
 */
public enum Subsituacao implements Serializable {

    CONVENIO("Convênio"),
    EM_ADITIVACAO("Em Aditivação"),
    EM_AJUSTE_PLANO_TRABALHO("Em Ajuste do Plano de Trabalho"),
    EM_AJUSTE_PELO_CONCEDENTE("Em Ajustes pelo Concedente"),
    EM_COMPLEMENTACAO("Em Complementação"),
    EM_ANALISE("Em Análise"),
    EM_COMPLEMENTACAO_PRORROGA("Em Complementação Prorroga"),
    EM_AJUSTE_PELO_CONVENENTE("Em Ajustes pelo Convenente"),
    EM_PRORROGACAO("Em Prorrogação"),
    CONVENIO_CANCELADO("Convênio Cancelado");

    private final String descricao;

    private Subsituacao(String desc) {
        this.descricao = desc;
    }

    private String descricao() {
        return this.descricao;
    }
}
