package ado2_laboratorio;

import java.util.Scanner;

public class TesteLaboratorio {
    public static void main(String[] args) {
        FilaLaboratorio fila = new FilaLaboratorio(10);
        Scanner scan = new Scanner(System.in);
        int contadorSenhas = 1;
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n--- LABORATÓRIO DE COLETA ---");
            System.out.println("1: Gerar Senha Comum");
            System.out.println("2: Gerar Senha Prioridade");
            System.out.println("3: Chamar Próximo");
            System.out.println("4: Ver Próximo da Fila");
            System.out.println("5: Listar Todas as Senhas");
            System.out.println("6: Excluir uma Senha (posição)");
            System.out.println("0: Sair");
            System.out.print("Escolha: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1 -> {
                    fila.enfileirar(new Paciente("C" + contadorSenhas++, false));
                    System.out.println("*********** Senha comum gerada. ***********");
                }
                case 2 -> {
                    fila.enfileirar(new Paciente("P" + contadorSenhas++, true));
                    System.out.println("*********** Senha prioridade gerada. ***********");
                }
                case 3 -> {
                    Paciente p = fila.chamarProximo();
                    System.out.println(p != null ? "*********** Chamando: " + p + "***********": "*********** Fila vazia!***********");
                }
                case 4 -> {
                    Paciente p = fila.espiar();
                    System.out.println(p != null ? "*********** Próximo: " + p + "***********": "*********** Fila vazia! ***********");
                }
                case 5 -> System.out.println("*********** Fila atual: " + fila + "***********");
                case 6 -> {
                    System.out.print("*********** Informe o índice (0 a n): ***********");
                    int idx = scan.nextInt();
                    try {
                        fila.remove(idx);
                        System.out.println("*********** Senha removida. ***********");
                    } catch (Exception e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                }
            }
        }
        scan.close();
    }
}
