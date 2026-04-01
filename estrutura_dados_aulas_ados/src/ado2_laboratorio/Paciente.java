package ado2_laboratorio;

public class Paciente {
    private String senha;
    private boolean prioridade;

    public Paciente(String senha, boolean prioridade) {
        this.senha = senha;
        this.prioridade = prioridade;
    }

    public boolean isPrioridade() { return prioridade; }
    public String getSenha() { return senha; }

    @Override
    public String toString() {
        return senha + (prioridade ? " (P)" : " (C)");
    }
}
