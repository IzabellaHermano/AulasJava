package desafios;

import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de usuários a serem cadastrados:");
        int qntUsuario = scanner.nextInt();

        String [] cabecalho = {"ID","NOME","TELEFONE","EMAIL"};
        String [][] matrizCadastro = new String[qntUsuario+1][cabecalho.length];
        matrizCadastro [0]= cabecalho;

        for (int linha = 1; linha <=qntUsuario ;linha++){
            System.out.println("-----------------------------------------------------");
            System.out.println("Cadastro Usuário"+linha);

            System.out.print("ID:"+linha);
            matrizCadastro[linha][0] =String.valueOf(linha);

            System.out.print("NOME:");
            matrizCadastro [linha][1] = scanner.nextLine();

            System.out.print("TELEFONE:");
            matrizCadastro [linha][2]= scanner.nextLine();

            System.out.println("EMAIL:");
            matrizCadastro [linha][3]= scanner.nextLine();


        }

    }
}
