package br.ufla.dcc.fiscalizabr.modelo;

import java.io.Serializable;

public enum SituacaoPublicacaoConvenio implements Serializable {

    A_PUBLICAR("A publicar"),
    NAO_PUBLICADO("Não publicado"),
    PUBLICADO("Publicado"),
    TRANSFERIDO_PARA_IMPRENSA_NACIONAL("Transferido para a imprensa nacional");
    
    private final String descricao;

    private SituacaoPublicacaoConvenio(String desc) {
        this.descricao = desc;
    }

    private String descricao() {
        return this.descricao;
    }
}
