package aula08.exercicios;

import java.io.*;


public class Exercicio03 {
    public static void main(String[] args) {
        String arquivo = "src\\aula08\\exercicios\\alunos.txt";
        String arquivoNovo = "src\\aula08\\exercicios\\backup_alunos.txt";

        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo));
             BufferedWriter escritor = new BufferedWriter(new FileWriter(arquivoNovo))){

            String linha;

            System.out.println("Realizando a Copia para o Arquivo: "+arquivoNovo);
            while ((linha= leitor.readLine())!=null){
                escritor.write(linha);
                escritor.newLine();
            }
            System.out.println("Copia Realizada com Sucesso.");
        } catch (IOException e) {
            System.out.println("Erro em Realizar Copia");
            e.printStackTrace();
        }
    }
}
