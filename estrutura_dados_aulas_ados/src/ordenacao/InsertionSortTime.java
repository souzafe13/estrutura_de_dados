package ordenacao;

public class InsertionSortTime {

    public static void main(String[] args) {

        // 1. Aumentei o tamanho para 50.000 para o tempo ser perceptível
        int[] vetor = new int[100000];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
        }

        System.out.println("Ordenando " + vetor.length + " elementos...");

        // 2. Registro do tempo de início
        long inicio = System.currentTimeMillis();

        // Método de ordenação: INSERTION SORT
        int aux, j;
        for (int i = 1; i < vetor.length; i++) {
            aux = vetor[i];
            j = i - 1;
            // Desloca os elementos maiores que o 'aux' para a direita
            while (j >= 0 && vetor[j] > aux) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            // Insere o 'aux' na posição correta
            vetor[j + 1] = aux;
        }

        // 3. Registro do tempo de fim
        long fim = System.currentTimeMillis();

        System.out.println("Tempo de execução: " + (fim - inicio) + "ms");
    }
}