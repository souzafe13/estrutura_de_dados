package ado1_livro_caixa;

public class Despesa {
    private String descricao;
    private String favorecido;
    private double valor;

    public Despesa() { 
    }

    public Despesa(String descricao, String favorecido, double valor) { 
        this.descricao = descricao;
        this.favorecido = favorecido;
        this.valor = valor;
    }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public String getCategoria() { return favorecido; }
    public void setFavorecido(String favorecido) { this.favorecido = favorecido; }

    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }

    @Override
    public String toString() {
        return "Despesa {descricao= " + descricao + ", favorecido= " + favorecido + ", valor= " + valor + "}";
    } 
}
