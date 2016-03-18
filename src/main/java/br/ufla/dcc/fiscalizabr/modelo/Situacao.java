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
public enum Situacao implements Serializable {

    AGUARDANDO_PRESTACAO_CONTAS("Aguardando Prestação de Contas"),
    EM_EXECUCAO("Em execução"),
    ASSINADO("Assinado"),
    PRESTACAO_CONTAS_EM_ANALISE("Prestação de Contas enviada para Análise"),
    PRESTACAO_CONTAS_REJEITADA("Prestação de Contas Rejeitada"),
    PRESTACAO_CONTAS_EM_COMPLEMENTACAO("Prestação de Contas em Complementação"),
    PRESTACAO_CONTAS_APROVADA("Prestação de Contas Aprovada"),
    PLANO_TRABALHO_COMPLEMENTADO_EM_ANALISE("Proposta Aprovada e Plano de Trabalho Complementado enviado para Análise"),
    PLANO_TRABALHO_EM_COMPLEMENTACAO("Proposta Aprovada e Plano de Trabalho em Complementação"),
    PROPOSTA_EM_ANALISE("Proposta em Análise"),
    PLANO_TRABALHO_EM_ANALISE("Plano de Trabalho em Análise");

    private final String descricao;

    private Situacao(String desc) {
        this.descricao = desc;
    }

    private String descricao() {
        return this.descricao;
    }
}
