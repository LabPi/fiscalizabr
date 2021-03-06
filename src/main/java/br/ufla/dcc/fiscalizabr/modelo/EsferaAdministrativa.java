package br.ufla.dcc.fiscalizabr.modelo;

import java.io.Serializable;

public enum EsferaAdministrativa implements Serializable {

    EMPRESA_PUBLICA_SOCIEDADE_ECONOMIA_MISTA("Empresa pública e sociedade de economia mista"),
    ESTADUAL("Estadual"),
    FEDERAL("Federal"),
    MUNICIPAL("Municipal"),
    PRIVADA("Privada"),
    CONSORCIO_PUBLICO("Consórcio público"),
    ORGANISMO_INTERNACIONAL("Organismo internacional");

    private final String descricao;

    private EsferaAdministrativa(String desc) {
        this.descricao = desc;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
