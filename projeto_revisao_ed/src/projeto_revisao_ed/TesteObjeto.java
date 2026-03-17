package projeto_revisao_ed;

public class TesteObjeto {
	public static void main (String [] args) throws Exception{
		VetorObjeto vetor = new VetorObjeto (5);
		
		Contato c1 = new Contato ("Claudio", "9999-2525", "claudio@gmail.com"); 
		Contato c2 = new Contato ("Daniel", "9999-0000", "daniel@gmail.com"); 
		Contato c3 = new Contato ("Fernanda", "9999-1111", "fernanda@gmail.com"); 
		

		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);

				
		System.out.println("Tamanho do vetor: " + vetor.tamanho());
		
		Contato c4 = new Contato ("Pedro", "9999-1111", "fernanda@gmail.com"); 
		
		vetor.adiciona(c4);			
		
		
		System.out.println("Tamanho do vetor: " + vetor);
		
		
		
	}
}
