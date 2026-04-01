package ado2_laboratorio;

public class FilaLaboratorio extends EstruturaEstatica {
    private int contPrioridade = 0;

    public FilaLaboratorio(int capacidade) {
        super(capacidade);
    }

    public void enfileirar(Paciente paciente) {
        if (paciente.isPrioridade()) {
            int pos = 0;
            
            while (pos < tamanho && ((Paciente)elementos[pos]).isPrioridade()) {
                pos++;
            }
            super.adiciona(pos, paciente);
        } else {
            super.adiciona(paciente);
        }
    }

    public Paciente chamarProximo() {
        if (this.estaVazia()) return null;

        int indexParaRemover = 0;

        // Regra 3:1
        if (((Paciente)elementos[0]).isPrioridade() && contPrioridade < 3) {
            contPrioridade++;
        } 
        else if (contPrioridade >= 3) {
            int primeiroComum = -1;
            for (int i = 0; i < tamanho; i++) {
                if (!((Paciente)elementos[i]).isPrioridade()) {
                    primeiroComum = i;
                    break;
                }
            }

            if (primeiroComum != -1) {
                indexParaRemover = primeiroComum;
                contPrioridade = 0; 
            } else {
                contPrioridade++;
            }
        }

        Paciente atendido = (Paciente) elementos[indexParaRemover];
        this.remove(indexParaRemover);
        return atendido;
    }

    public Paciente espiar() {
        return this.estaVazia() ? null : (Paciente) elementos[0];
    }
}
