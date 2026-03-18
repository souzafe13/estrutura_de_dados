package estrutura_estatica_aula4;

public class Main {

	public static void main (String[] args) {
		Pilha<Integer> pilha = new Pilha<Integer> ();
		
		/*for(int i = 1; i <= 15; i++) {
			pilha.adiciona(i);
		}*/
		
		System.out.println("Verifica se a Pilha está vazia: " + pilha.estaVazia());
		System.out.println("Informação no topo da Pilha: " + pilha.topo());
		
		pilha.adiciona(1);
		pilha.adiciona(2);
		pilha.adiciona(3);
		
		System.out.println("Verifica se a Pilha está vazia: " + pilha.estaVazia());
		System.out.println("Informação no topo da Pilha: " + pilha.topo());
		
		pilha.desempilha();
		
		System.out.println("Dados da Pilha: " + pilha.toString());
		System.out.println("Quantidade de Dados na Pilha: " + pilha.tamanho());
	}
}
