package ado1_livro_caixa;

import java.util.Scanner;

public class TesteFazenda {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        VetorObjeto vetor = new VetorObjeto(10); 
        int opcao = -1;

        while (opcao != 0) { // aqui voltará sempre ao menu
            System.out.println("\n--- SISTEMA DE LIVRO CAIXA DA FAZENDA ---");
            System.out.println(" 1- Incluir \n 2- Pesquisar \n 3- Alterar \n 4- Excluir \n 5- Listar \n 0- Sair");
            System.out.print("Opção: ");
            opcao = leitor.nextInt();
            leitor.nextLine(); 

            if (opcao == 1) {
                // Validação da Descrição
                System.out.print("Descrição: "); 
                String d = leitor.nextLine();
                while (d.trim().isEmpty()) {
                    System.out.println("Erro: A descrição não pode ficar em branco!");
                    System.out.print("Descrição: ");
                    d = leitor.nextLine();
                }

                // Validação do Favorecido
                System.out.print("Favorecido: "); 
                String f = leitor.nextLine();
                while (f.trim().isEmpty()) {
                    System.out.println("Erro: O favorecido não pode ficar em branco!");
                    System.out.print("Favorecido: ");
                    f = leitor.nextLine();
                }

                System.out.print("Valor: "); 
                double v = leitor.nextDouble();
                
                vetor.adiciona(new Despesa(d, f, v));
                System.out.println("Adicionado com sucesso!");
            } 
            else if (opcao == 2) {
                System.out.print("Digite o índice para pesquisa: ");
                int idx = leitor.nextInt();
                System.out.println("Resultado: " + vetor.busca(idx));
            }
            else if (opcao == 3) {
                System.out.print("Índice para alterar: ");
                int idx = leitor.nextInt(); leitor.nextLine();
                
                // Validação da Nova Descrição
                System.out.print("Nova Descrição: "); 
                String d = leitor.nextLine();
                while (d.trim().isEmpty()) {
                    System.out.println("Erro: A nova descrição não pode ficar em branco!");
                    System.out.print("Nova Descrição: ");
                    d = leitor.nextLine();
                }

                // Validação do Novo Favorecido
                System.out.print("Novo Favorecido: "); 
                String f = leitor.nextLine();
                while (f.trim().isEmpty()) {
                    System.out.println("Erro: O novo favorecido não pode ficar em branco!");
                    System.out.print("Novo Favorecido: ");
                    f = leitor.nextLine();
                }

                System.out.print("Novo Valor: "); 
                double v = leitor.nextDouble();
                
                vetor.editar(idx, new Despesa(d, f, v));
                System.out.println("Alterado com sucesso!");
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