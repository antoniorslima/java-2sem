package org.example;

public class Aluno {
    private String id;
    private String nome;
    private AssinaturaEnum assinatura;
    private Integer qtdCursos;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public AssinaturaEnum getAssinatura() {
        return assinatura;
    }

    public void setAssinatura(AssinaturaEnum assinatura) {
        this.assinatura = assinatura;
    }

    public Integer getQtdCursos() {
        return qtdCursos;
    }

    public void setQtdCursos(Integer qtdCursos) {
        this.qtdCursos = qtdCursos;
    }

    public Aluno(String id, String nome, Integer qtdCursos) {
        this.id = id;
        this.nome = nome;
        this.qtdCursos = qtdCursos;
        this.assinatura = AssinaturaEnum.getPorQtdCursos(qtdCursos);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Aluno\n");
        sb.append("id: '").append(id).append('\'');
        sb.append(", nome: '").append(nome).append('\'');
        sb.append(", assinatura: ").append(assinatura.getDescricao());
        return sb.toString();
    }
}
