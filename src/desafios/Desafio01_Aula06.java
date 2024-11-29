package desafios;

import java.util.Scanner;

public class Desafio01_Aula06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de usuários a serem cadastrados:");
        int qntUsuario = scanner.nextInt();
        scanner.nextLine();

        String [] cabecalho = {"ID","NOME","TELEFONE","EMAIL"};
        String [][] matrizCadastro = new String[qntUsuario+1][cabecalho.length];
        matrizCadastro [0]= cabecalho;

        for (int linha = 1; linha <=qntUsuario ;linha++){
            System.out.println("-----------------------------------------------------");
            System.out.println("Preencha os dados a seguir:");
            System.out.println("Cadastro do usuário "+linha);

            System.out.print("ID:"+linha);
            matrizCadastro[linha][0] =String.valueOf(linha);
            scanner.nextLine();

            System.out.print("NOME:");
            matrizCadastro [linha][1] = scanner.nextLine();


            System.out.print("TELEFONE:");
            matrizCadastro [linha][2]= scanner.nextLine();


            System.out.print("EMAIL:");
            matrizCadastro [linha][3]= scanner.nextLine();

        }
        String tabela="";
        for(String[]linha :matrizCadastro){
            for (int coluna = 0; coluna < linha.length ; coluna++) {
                tabela += linha[coluna] + "\t\t";
            }
            tabela += "\n";
        }
        System.out.println(tabela);
        scanner.close();

    }
}
