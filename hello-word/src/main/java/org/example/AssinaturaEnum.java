package org.example;

public enum AssinaturaEnum {

    BRONZE("pobre"),
    PRATA("bem de vida"),
    OURO("rico");

    private String descricao;

    AssinaturaEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public static AssinaturaEnum getPorQtdCursos(Integer qtdCursos) {
        if (qtdCursos > 10) {
            return OURO;
        } else if (qtdCursos > 5) {
            return PRATA;
        } else {
            return BRONZE;
        }
    }
}
