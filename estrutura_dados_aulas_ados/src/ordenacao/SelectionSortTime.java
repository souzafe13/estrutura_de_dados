package ordenacao;

public class SelectionSortTime {

    public static void main(String[] args) {

        int[] vetor = new int[10];

        // Preenchendo o vetor
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
            System.out.print(vetor[i] + " ");
        }
        System.out.println("\n---");

        // Iniciando a medição ANTES do algoritmo começar
        long inicio = System.currentTimeMillis();

        // Método de ordenação SelectionSort
        int menor_posicao, aux;
        for (int i = 0; i < vetor.length; i++) {
            menor_posicao = i;
            // Procura o menor elemento no restante do vetor
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[menor_posicao]) {
                    menor_posicao = j;
                }
            } 

            // Troca os valores
            aux = vetor[menor_posicao];
            vetor[menor_posicao] = vetor[i];
            vetor[i] = aux;
        }

        // Finalizando a medição DEPOIS que o algoritmo termina
        long fim = System.currentTimeMillis();

        // Exibindo o vetor ordenado para conferência
        for (int i : vetor) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nTempo de execução: " + (fim - inicio) + "ms");
    }
}
