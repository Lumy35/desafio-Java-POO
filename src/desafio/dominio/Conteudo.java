package desafio.dominio;

public abstract class Conteudo {
    private String titulo;
    private String descricao;
    protected static final double XP_PADRAO = 10;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract double calcularXP();
}
