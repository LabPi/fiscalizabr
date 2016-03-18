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
public enum Modalidade implements Serializable {
    CONTRATO_REPASSE("Contrato de Repasse"),
    CONVENIO("Convênio"),
    TERMO_COOPERACAO("Termo de Cooperação"),
    TERMO_PARCERIA("Termo de Parceria");    
    
    private final String descricao;
    private Modalidade(String desc) {
        this.descricao = desc;
    }
    private String descricao() {
        return this.descricao;
    }
}
