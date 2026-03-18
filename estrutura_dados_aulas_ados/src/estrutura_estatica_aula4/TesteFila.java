package estrutura_estatica_aula4;

public class TesteFila {
public static void main(String [] args) {
Fila<Integer> fila = new Fila<Integer>();
fila.enfileira(1);
fila.enfileira(2);
fila.enfileira(3);
// Vamos visualizar a fila
System.out.println(fila.toString());
//Vamos desenfileirar um elemento
System.out.println(fila.desenfileira());
//Vamos visualizar a fila novamente após remover um elemento
System.out.println(fila.toString());
/*// Vamos espiar a fila
System.out.println(fila.espiar());
//poderíamos criar uma estrutura de decisão com o retorno do método
if (fila.espiar() == null) {
System.out.println("Ninguém na fila");
} else {
System.out.println("O elemento da primeira posição é " + fila.espiar());
}
// Vamos verificar se a fila está vazia, nesse caso será false
System.out.println("A fila etá vazia? " + fila.estaVazia());
// Vamos verificar o tamanho da minha fila após enfileirar
System.out.println("Qual é o tamanho da fila? " + fila.tamanho());
// Vamos visualizar os elementos dentro da fila
System.out.println(fila.toString());*/
}

}
