package ordenacao;

public class BubbleSortTime {

    public static void main(String[] args) {

        int[] vetor = new int[1000];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = ((int) (Math.random() * vetor.length));

        }

        // variável que registra o tempo de execução no início
        long inicio = System.currentTimeMillis();

        // Método de ordenação BubbleSort

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

        // Variável para registrar o tempo de execução no final

        long fim = System.currentTimeMillis();

        // Exibindo o tempo de execução

        System.out.println("<Tempo de execução: >" + (fim - inicio));
    }
}
