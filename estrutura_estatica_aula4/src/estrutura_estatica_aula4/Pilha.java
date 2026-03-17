package estrutura_estatica_aula4;

public class Pilha <T> extends EstruturaEstatica <T> { // isso é herdar
	 // método construtor sem parâmentros
	public Pilha() {
		super();
	}
	
	// método Construtor com parâmetros o super porque está herdando...
	
	public Pilha (int capacidade) {
		super (capacidade);
	}
	
	// Método para adicionar elementos na Pilha
	public void empilha (T elemento) {
		// dessa forma estamos reutilizando o código da classe pai
		super.adiciona(elemento);
	}
	
	// Método para visualizar a informação no topo da Pilha
	public T topo() {
		if(this.estaVazia()) {
			return null;
		} else {
			return this.elementos[tamanho-1];
		}
		
	}
		public T desempilha() {
			if(this.estaVazia ()) {
				return null; 
			}
			T elemento  = this.elementos[tamanho - 1];
			
			// usar um dos 4 abaixo: 
			super.remove(this.tamanho - 1); // o super vai pegar o "remove" da Estrutura Estática, não da Pilha
			//this.elementos[tamanho - 1] = null;
			//tamanho --;
			//remove(this.tamanho - 1); --- Já esta referenciando 
			return elemento;
		}
	}


