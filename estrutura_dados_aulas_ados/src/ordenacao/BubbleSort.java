package ordenacao;

public class BubbleSort {
    public static void main(String[] args) {
        // criando um vetor de números inteiros de 10 posições
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = ((int) (Math.random() * vetor.length));

            System.out.println(vetor[i]);
        }

        int aux;
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] > vetor[j]) {
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                }

            }

        }
        System.out.println("Nosso vetor ordenado");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

    }
}