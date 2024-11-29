package desafios;

import java.util.Scanner;

public class Desafio02_Aula07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String menu= """
                ________________________________________________________________
                |   Escolha uma Opição:                                         |
                |       1- Exibir Cadastro Completo                             |
                |       2- Cadastrar Usuário                                    |
                |       3- Atualizar Usuário                                    |
                |       4- Deletar Usuário                                      |
                |       5- Sair                                                 |
                |_______________________________________________________________|
                """;
        int opcao;

        do {
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    exibirUsuarios();
                    break;
                case 2:
                    cadastrarUsuarios();
                    break;
                case 3:
                    atualizarUsuarios();
                    break;
                case 4:
                    deletarUsuarios();
                    break;
                case 5:
                    System.out.println("Fim de Programa");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }while (opcao != 5);

    }
    public static void exibirUsuarios(){
        System.out.println("exibirUsuarios");
    }
    public static void cadastrarUsuarios(){
        System.out.println("cadastrarUsuarios");
    }
    public static void atualizarUsuarios(){
        System.out.println("atualizarUsuarios");
    }
    public static void deletarUsuarios(){
        System.out.println("deletarUsuarios");
    }
}
