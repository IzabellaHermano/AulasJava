package aula08.exercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercicio02 {
    public static void main(String[] args) {
        String arquivo ="src\\aula08\\exercicios\\alunos.txt";

        try(BufferedReader leitura = new BufferedReader(new FileReader (arquivo))) {
            String linha;
            System.out.println("Conteúdo do Arquivo:");
            while ((linha = leitura.readLine())!= null){
                System.out.println(linha);
            }

        } catch (IOException e){
            System.out.println("Erro em Realizar Leitura");

        }
    }
}
