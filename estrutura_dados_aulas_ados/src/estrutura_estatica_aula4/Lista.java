package estrutura_estatica_aula4;

public class Lista <T> extends EstruturaEstatica<T> { // isso é herdar
	
	// Método Construtor com parâmentros o Super porque está herdando ...
	public Lista (int capacidade) {
		super(capacidade);
	}
	
	// Método Construtor sem parâmentro
	public Lista() {
		super();
	}
	
	// Método para adicionar elementos na Lista
	public boolean adiciona (T elemento) {
		return super.adiciona(elemento);
	}
	
	// Método para adicionar elementros na Lista em uma posição específica
	public boolean adiciona (int posicao, T elemento) {
		return super.adiciona(posicao, elemento);
	}

}
