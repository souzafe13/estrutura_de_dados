import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Grafo<TIPO> {
    private ArrayList<Vertice<TIPO>> vertices;
    private ArrayList<Aresta<TIPO>> arestas;

    public Grafo() {
        this.vertices = new ArrayList<Vertice<TIPO>>();
        this.arestas = new ArrayList<Aresta<TIPO>>();
    }

    public void adicionarVertice(TIPO dado) {
        Vertice<TIPO> novo = new Vertice<TIPO>(dado);
        this.vertices.add(novo);
    }

    public void adicionarAresta(Double peso, TIPO inicio, TIPO fim) {
        Vertice<TIPO> verticeInicio = getVertice(inicio);
        Vertice<TIPO> verticeFim = getVertice(fim);

        Aresta<TIPO> aresta = new Aresta<TIPO>(peso, verticeInicio, verticeFim);

        verticeInicio.adicionarArestaSaida(aresta);
        verticeFim.adicionarArestaEntrada(aresta);

        this.arestas.add(aresta);
    }

    public Vertice<TIPO> getVertice(TIPO dado) {
        for (int i = 0; i < vertices.size(); i++) {
            if (vertices.get(i).getDado().equals(dado)) {
                return vertices.get(i);
            }
        }
        return null;
    }

    public boolean existeVertice(TIPO dado) {
        return getVertice(dado) != null;
    }

    public void listarPontos() {
        System.out.println("Pontos disponíveis:");

        for (int i = 0; i < vertices.size(); i++) {
            System.out.print(vertices.get(i).getDado());

            if (i < vertices.size() - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("\n");
    }

    public void mostrarRotas(TIPO inicio, TIPO fim, int quantidade) {
        Vertice<TIPO> origem = getVertice(inicio);
        Vertice<TIPO> destino = getVertice(fim);

        if (origem == null || destino == null) {
            System.out.println("Ponto de partida ou chegada inválido.");
            return;
        }

        class Caminho {
            Vertice<TIPO> atual;
            double distancia;
            ArrayList<Vertice<TIPO>> percurso;

            Caminho(Vertice<TIPO> atual, double distancia, ArrayList<Vertice<TIPO>> percurso) {
                this.atual = atual;
                this.distancia = distancia;
                this.percurso = percurso;
            }
        }

        PriorityQueue<Caminho> fila = new PriorityQueue<Caminho>(
            Comparator.comparingDouble(c -> c.distancia)
        );

        ArrayList<Vertice<TIPO>> primeiroPercurso = new ArrayList<Vertice<TIPO>>();
        primeiroPercurso.add(origem);

        fila.add(new Caminho(origem, 0.0, primeiroPercurso));

        ArrayList<Caminho> rotasEncontradas = new ArrayList<Caminho>();

        while (!fila.isEmpty() && rotasEncontradas.size() < quantidade) {
            Caminho caminhoAtual = fila.poll();

            if (caminhoAtual.atual.equals(destino)) {
                rotasEncontradas.add(caminhoAtual);
                continue;
            }

            for (Aresta<TIPO> aresta : caminhoAtual.atual.getArestasSaida()) {
                Vertice<TIPO> proximo = aresta.getFim();

                if (!caminhoAtual.percurso.contains(proximo)) {
                    ArrayList<Vertice<TIPO>> novoPercurso = new ArrayList<Vertice<TIPO>>(caminhoAtual.percurso);
                    novoPercurso.add(proximo);

                    double novaDistancia = caminhoAtual.distancia + aresta.getPeso();

                    fila.add(new Caminho(proximo, novaDistancia, novoPercurso));
                }
            }
        }

        if (rotasEncontradas.size() == 0) {
            System.out.println("Nenhum caminho encontrado.");
            return;
        }

        for (int i = 0; i < rotasEncontradas.size(); i++) {
            Caminho rota = rotasEncontradas.get(i);

            System.out.println("Rota " + (i + 1) + ":");

            for (int j = 0; j < rota.percurso.size(); j++) {
                System.out.print(rota.percurso.get(j).getDado());

                if (j < rota.percurso.size() - 1) {
                    System.out.print(" -> ");
                }
            }

            System.out.println();
            System.out.println("Distância total: " + rota.distancia + " metros\n");
        }
    }
}