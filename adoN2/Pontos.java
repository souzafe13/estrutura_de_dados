import java.util.Scanner;

public class Pontos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Grafo<String> grafo = new Grafo<String>();

        grafo.adicionarVertice("A");
        grafo.adicionarVertice("B");
        grafo.adicionarVertice("C");
        grafo.adicionarVertice("D");
        grafo.adicionarVertice("E");
        grafo.adicionarVertice("F");
        grafo.adicionarVertice("G");
        grafo.adicionarVertice("H");
        grafo.adicionarVertice("I");
        grafo.adicionarVertice("J");
        grafo.adicionarVertice("K");
        grafo.adicionarVertice("L");
        grafo.adicionarVertice("M");
        grafo.adicionarVertice("N");
        grafo.adicionarVertice("O");
        grafo.adicionarVertice("P");
        grafo.adicionarVertice("Q");
        grafo.adicionarVertice("R");
        grafo.adicionarVertice("S");
        grafo.adicionarVertice("T");
        grafo.adicionarVertice("U");
        grafo.adicionarVertice("V");
        grafo.adicionarVertice("X");

        grafo.adicionarAresta(300.0, "A", "B");
        grafo.adicionarAresta(300.0, "B", "A");

        grafo.adicionarAresta(47.0, "B", "C");
        grafo.adicionarAresta(47.0, "C", "B");

        grafo.adicionarAresta(62.0, "C", "D");
        grafo.adicionarAresta(62.0, "D", "C");

        grafo.adicionarAresta(8.0, "D", "E");
        grafo.adicionarAresta(8.0, "E", "D");

        grafo.adicionarAresta(13.0, "E", "F");
        grafo.adicionarAresta(13.0, "F", "E");

        grafo.adicionarAresta(230.0, "E", "G");
        grafo.adicionarAresta(230.0, "G", "E");

        grafo.adicionarAresta(141.0, "C", "H");
        grafo.adicionarAresta(141.0, "H", "C");

        grafo.adicionarAresta(138.0, "H", "I");
        grafo.adicionarAresta(138.0, "I", "H");

        grafo.adicionarAresta(153.0, "I", "J");
        grafo.adicionarAresta(153.0, "J", "I");

        grafo.adicionarAresta(512.0, "J", "K");
        grafo.adicionarAresta(512.0, "K", "J");

        grafo.adicionarAresta(135.0, "K", "L");
        grafo.adicionarAresta(135.0, "L", "K");

        grafo.adicionarAresta(50.0, "L", "M");
        grafo.adicionarAresta(50.0, "M", "L");

        grafo.adicionarAresta(187.0, "L", "N");
        grafo.adicionarAresta(187.0, "N", "L");

        grafo.adicionarAresta(108.0, "N", "O");
        grafo.adicionarAresta(108.0, "O", "N");

        grafo.adicionarAresta(82.0, "O", "P");
        grafo.adicionarAresta(82.0, "P", "O");

        grafo.adicionarAresta(215.0, "P", "Q");
        grafo.adicionarAresta(215.0, "Q", "P");

        grafo.adicionarAresta(97.0, "Q", "R");
        grafo.adicionarAresta(97.0, "R", "Q");

        grafo.adicionarAresta(33.0, "R", "S");
        grafo.adicionarAresta(33.0, "S", "R");

        grafo.adicionarAresta(243.0, "R", "T");
        grafo.adicionarAresta(243.0, "T", "R");

        grafo.adicionarAresta(207.0, "S", "T");
        grafo.adicionarAresta(207.0, "T", "S");

        grafo.adicionarAresta(38.0, "S", "V");
        grafo.adicionarAresta(38.0, "V", "S");

        grafo.adicionarAresta(210.0, "V", "U");
        grafo.adicionarAresta(210.0, "U", "V");

        grafo.adicionarAresta(22.0, "U", "T");
        grafo.adicionarAresta(22.0, "T", "U");

        grafo.adicionarAresta(107.0, "U", "X");
        grafo.adicionarAresta(107.0, "X", "U");

        grafo.adicionarAresta(317.0, "X", "A");
        grafo.adicionarAresta(317.0, "A", "X");

        grafo.adicionarAresta(370.0, "V", "A");
        grafo.adicionarAresta(370.0, "A", "V");

        System.out.println("Jardim Taquaral - Santo Amaro - São Paulo/SP");
        System.out.println("Sistema de rotas usando grafo\n");

        String continuar = "S";

        while (continuar.equals("S")) {
            grafo.listarPontos();

            System.out.print("Digite o ponto de partida: ");
            String partida = teclado.nextLine().toUpperCase();

            while (!grafo.existeVertice(partida)) {
                System.out.print("Ponto inválido. Digite novamente: ");
                partida = teclado.nextLine().toUpperCase();
            }

            System.out.print("Digite o ponto de chegada: ");
            String chegada = teclado.nextLine().toUpperCase();

            while (!grafo.existeVertice(chegada)) {
                System.out.print("Ponto inválido. Digite novamente: ");
                chegada = teclado.nextLine().toUpperCase();
            }

            System.out.println("\nRotas de " + partida + " até " + chegada + ":\n");

            grafo.mostrarRotas(partida, chegada, 2);

            System.out.print("Deseja calcular outra rota? S/N: ");
            continuar = teclado.nextLine().toUpperCase();

            System.out.println();
        }

        System.out.println("Programa encerrado.");
        teclado.close();
    }
}