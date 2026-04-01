package lista;

public class ListaEncadeada<Tipo> {
    // *** aqui são os atributos ***
    private No inicio;
    private No fim;
    private int tamanho;

    // Método construtor
    public ListaEncadeada() {
        this.tamanho = 0;
    }

    // Métodos de acesso

    public No getInicio() {
        return inicio;
    }

    public void setInicio(No inicio) {
        this.inicio = inicio;
    }

    public No getFim() {
        return fim;
    }

    public void setFim(No fim) {
        this.fim = fim;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    // Método de Exibição

    @Override
    public String toString() {
        return "ListaEncadeada [inicio=" + inicio + "]"; // aqui foi o "toString" no botão direito
    }

    // Método para adicionar
    public void adiciona(Tipo elemento) {
        No<Tipo> celula = new No<Tipo>(elemento);
        if (this.inicio == null && this.fim == null) {
            this.inicio = celula;
            this.fim = celula;
        } else {
            this.fim.setProximo(celula);
            this.fim = celula;
        }
        this.tamanho++;
    }

    // Método para buscar o Nó

    public No get(int posicao) {
        No atual = this.inicio;
        for (int i = 0; i < posicao; i++) {
            if (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
        }
        return atual;
    }

    // Método para remover o Nó --- início, meio e fim
    public void remover(Tipo elemento) {
        No anterior = null;
        No atual = this.inicio;
        for (int i = 0; i < this.getTamanho(); i++) {
            if (atual.getElemento().equals(elemento)) {
                if (this.tamanho == 1) { // aqui eu verifico se há um elemento para remover
                    this.inicio = null;
                    this.fim = null;
                } else if (atual == inicio) { // aqui eu pego o próximo elemnto para excluir
                    this.inicio = atual.getProximo();
                    atual.setProximo(null);
                } else if (atual == fim) { // o fim deve estar null, igual o anterior que acabei de excluir
                    this.fim = anterior;
                    anterior.setProximo(null);
                } else
                    anterior.setProximo(atual.getProximo());
                atual = null;
                this.tamanho--;
                break;
            }
            anterior = atual;
            atual = atual.getProximo();
        }
    }
}