package ado1_livro_caixa;

import java.util.Scanner;

public class TesteFazenda {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        VetorObjeto vetor = new VetorObjeto(10); 
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n--- SISTEMA DE LIVRO CAIXA DA FAZENDA ---");
            System.out.println("\n 1- Incluir \n 2- Pesquisar \n 3- Alterar \n 4- Excluir \n 5- Listar \n 0- Sair"); // se eu colocar o "\n, fica mais bonito"
            System.out.print("Opção: ");
            opcao = leitor.nextInt();
            leitor.nextLine(); 

            if (opcao == 1) {
                System.out.print("Descrição: "); String d = leitor.nextLine();
                System.out.print("Favorecido: "); String c = leitor.nextLine();
                System.out.print("Valor: "); double v = leitor.nextDouble();
                vetor.adiciona(new Despesa(d, c, v));
            } 
            else if (opcao == 2) {
                System.out.print("Digite o índice para pesquisa: ");
                int idx = leitor.nextInt();
                System.out.println("Resultado: " + vetor.busca(idx));
            }
            else if (opcao == 3) {
                System.out.print("Índice para alterar: ");
                int idx = leitor.nextInt(); leitor.nextLine();
                System.out.print("Nova Descrição: "); String d = leitor.nextLine();
                System.out.print("Nova Favorecido: "); String c = leitor.nextLine();
                System.out.print("Novo Valor: "); double v = leitor.nextDouble();
                vetor.editar(idx, new Despesa(d, c, v));
            }
            else if (opcao == 4) {
                System.out.print("Índice para excluir: ");
                int idx = leitor.nextInt();
                vetor.remove(idx);
                System.out.println("Removido com sucesso!");
            }
            else if (opcao == 5) {
                System.out.println(vetor);
            }
        }
        leitor.close();
    }
}