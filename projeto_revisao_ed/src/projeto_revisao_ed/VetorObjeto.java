package projeto_revisao_ed;

import java.util.Arrays;

public class VetorObjeto {
	// Lista de atributos
		public Object[] elementos;
		public int tamanho;
		
		// Método Construtor o que ta em parentes é paramentro 
		public VetorObjeto (int capacidade) {
			this.elementos = new Object [capacidade];
			this.tamanho = 0;
		}
		
		public void adiciona(Object elemento) {
			this.aumentaCapacidade();
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			}
		
		public int tamanho () {
			return this.tamanho;
		}
		
		@Override
		public String toString() {
			StringBuilder s = new StringBuilder();
			s.append("[");
			
			//Pega o primeiro valor do vetor até o penúltimo valor do vetor
			for(int i=0; i<this.tamanho-1; i++) {
				s.append(this.elementos[i]);
				s.append(", ");
			}
			
			//Pega o último valor do vetor
			if(this.tamanho > 0 ) {
				s.append(this.elementos[this.tamanho -1]);
			}
			
			s.append("]");
			
			return s.toString();
		}
		
		public Object busca (int posicao) throws Exception {
			if(posicao >=0 && posicao < tamanho) {
				return this.elementos [posicao];
			} else {
				throw new Exception ("Posição inválida!");
			}
		}
		
		public int busca1 (Object elemento) {
			for (int i = 0; i < tamanho; i++) {
				if (elementos [i].equals(elemento)) {
					return i;
				}
			}
			
		return -1;
		}
		
		public boolean adicionaInicio (int posicao,Object elemento) throws Exception {
			this.aumentaCapacidade();
			if (posicao >= 0 && posicao < tamanho) {
				for (int i = this.tamanho - 1; i >= posicao; i--) {
					this.elementos[i + 1] = this.elementos [i];
				}
				this.elementos[posicao] = elemento;
				this.tamanho++;
			} else {
				throw new Exception ("Posição inválida!!");
			}
			return true;
					
				}
		// aqui vai aumentar a capacidade do vetor, sobrepondo o vetor "elementos".
		public void aumentaCapacidade () {
			if(this.tamanho == this.elementos.length) {
				Object[] elementosNovos = new Object [this.elementos.length * 2];
				for (int i=0; i<elementos.length; i++) {
					elementosNovos [i] = this.elementos[i];
				}
				this.elementos = elementosNovos;
			}
		}
			
		public void remove(int posicao) throws Exception {
			if (posicao >= 0 && posicao < tamanho) {
				for (int i  = posicao; i < this.tamanho - 1; i++) {
					this.elementos[i] = this.elementos[i + 1];
				}
				this.elementos[this.tamanho - 1] = null;
				this.tamanho--;
			} else {
				throw new Exception ("Posição inválida!");
			}
		}
		
		public void removeTexto(Object elemento) throws Exception { // remover uma informação 
			int posicao = this.busca1(elemento);
			this.busca(posicao);
			this.remove(posicao);
			
		}
		
		public void editar (int posicao, Object elemento) throws Exception{
			if (posicao >= 0 && posicao < tamanho) {
				this.elementos[posicao] = elemento;
			} else {
				throw new Exception ( "Posição inválida!!");
			}
		}
		
	}

		

			
		




