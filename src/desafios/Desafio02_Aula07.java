package desafios;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio02_Aula07 {

    //Variável global
    static String [] cabecalho = {"ID","NOME","TELEFONE","EMAIL"};
    static String [][] matrizCadastro;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String menu= """
                _________________________________________________________________
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

    }
    public static void cadastrarUsuarios(){

        System.out.print("Informe a quantidade de usuários a serem cadastrados:");
        int qntUsuario = scanner.nextInt();
        scanner.nextLine();

        String[][] novaMatriz= new String[matrizCadastro.length + qntUsuario][cabecalho.length];

        for ( int linha = 0; linha < matrizCadastro.length ;linha++){
            novaMatriz [linha] = Arrays.copyOf(matrizCadastro[linha],matrizCadastro[linha].length);
        }

        System.out.println("Preencha os dados a seguir:");

        for (int linha = matrizCadastro.length; linha <= novaMatriz.length ;linha++){

            System.out.print("ID:"+linha);
            novaMatriz[linha][0] =String.valueOf(linha);

            for (int coluna  = 1; coluna  < cabecalho.length; coluna ++) {
                System.out.print(cabecalho[coluna] +": ");
                novaMatriz [linha][coluna] = scanner.nextLine();

            }
        }
    }
    public static void atualizarUsuarios(){
        System.out.println("atualizarUsuarios");
    }
    public static void deletarUsuarios(){
        System.out.println("deletarUsuarios");
    }
}
