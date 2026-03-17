package projeto_revisao_ed;

public class Teste {

	public static void main(String[] args)throws Exception{
		Vetor vetor = new Vetor (5); // Classe maiúscula
		
		/*vetor.adiciona("Elemento 1");
		vetor.adiciona("Elemento 2");
		
		System.out.println("Quantidade de dados no vetor: " + vetor.tamanho());
		
		System.out.println("Dados do vetor: " + vetor.toString());
		
		System.out.println("Dado na segunda posição do vetor: " + vetor.busca(1));
		
		System.out.println("Posição da informação no vetor: " + vetor.busca1("Elemento 1"));*/
		
		vetor.adiciona("Elemento 1");
		vetor.adiciona("Elemento 2");
		vetor.adiciona("Elemento 3");
		vetor.adiciona("Elemento 4");
		vetor.adiciona("Elemento 5");
		vetor.adiciona("Elemento 6");
		vetor.adiciona("Elemento 7");
		
		System.out.println("Quantidade de dados no vetor: " + vetor.tamanho());
		System.out.println("Dados do vetor: " + vetor.toString());
		
		vetor.remove(2);
		
		System.out.println("Quantidade de dados no vetor: " + vetor.tamanho());
		System.out.println("Dados do vetor: " + vetor.toString());
		
	}

}
