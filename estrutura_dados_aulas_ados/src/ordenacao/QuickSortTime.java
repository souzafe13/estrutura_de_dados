package ordenacao;

public class QuickSortTime {

    public static void main(String[] args) {
        // criando um vetor de números inteiros de 10 posições
        int[] vetor = new int[10];

        // inserindo valores no vetor
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
            // exibindo os valores do vetor
            System.out.println(vetor[i]);
        }
        // início e fim
        long inicio = System.currentTimeMillis();
        ordenaQuickSort(vetor, 0, vetor.length - 1);
        long fim = System.currentTimeMillis();
        System.out.println("<Tempo de execução: >" + (fim - inicio));
    }

    // método para ordenar
    static void ordenaQuickSort(int[] vetor, int esquerda, int direita) {
        if (esquerda < direita) {
            int p = particao(vetor, esquerda, direita);
            ordenaQuickSort(vetor, esquerda, p);
            ordenaQuickSort(vetor, p + 1, direita);

        }
    }

    // método para criar as partições (dividir o vetor em partes)
    static int particao(int[] vetor, int esquerda, int direita) {
        int meio = (int) (esquerda + direita) / 2;
        int pivo = vetor[meio];
        int i = esquerda - 1;
        int j = direita + 1;
        while (true) {
            do {
                i++;
            } while (vetor[i] < pivo);
            do {
                j--;
            } while (vetor[j] > pivo);
            if (i >= j) {
                return j;
            }
            int aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
        }

    }
}