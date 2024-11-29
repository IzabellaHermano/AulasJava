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
        System.out.println(menu);
        int opcao = scanner.nextInt();;
        scanner.nextLine();

        switch (opcao){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                System.out.println("Opção inválida.");
        }

    }
    public static void exibirUsuarios(){
    }
    public static void cadastrarUsuarios(){
    }
    public static void atualizarUsuarios(){
    }
    public static void deletarUsuarios(){
    }
}
