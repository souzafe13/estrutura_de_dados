package estrutura_estatica_aula4;

import java.util.Stack;

public class Teste {
	
	public static void main (String[] args) {
		Stack<Integer> stack = new Stack<Integer> ();
		
		// método para verificar se a pilha está vazia 
		
		System.out.println(stack.isEmpty());
		
		// método para empilhar
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		// método para verificar o tamanho da pilha
		
		System.out.println(stack.size());
		
		// Método toString para exibir a pilha
		System.out.println(stack);
		
		// Método  para verificar o topo
		System.out.println(stack.peek());
		
		// Método para desempilhar
		System.out.println(stack.pop());
		
		// Método toString para exibir a pilha
		System.out.println(stack);
				
				
		
	}
}
