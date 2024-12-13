package aula08.exercicios;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        File arquivo = new File("src\\aula08\\exercicios\\alunos.txt");

        try {
            FileWriter escrever = new FileWriter(arquivo);

            System.out.println("Insira o Nome dos Alunos:");
            for (int i = 1; i <=5 ; i++) {

                System.out.print("Aluno "+i+": ");
                String nomeAlunos = scanner.nextLine();
                escrever.write(nomeAlunos+"\n");

            }
            escrever.close();
            System.out.println("Nomes Salvos com Sucesso");


        } catch (IOException e) {
            System.out.println("Error em Salvar Arquivo");
            e.printStackTrace();
        }

    }
}
