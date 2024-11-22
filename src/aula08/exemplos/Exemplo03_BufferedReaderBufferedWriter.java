package aula08.exemplos;

import java.io.*;

public class Exemplo03_BufferedReaderBufferedWriter {
    public static void main(String[] args) {
        File arquivo = new File("src\\aula08\\exemplos\\arquivo.txt");
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(arquivo));
            bufferedWriter.write("Novo Texto gravado no arquivo\nOlá");
            bufferedWriter.close();

            BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivo));
            String linha;
            while ((linha = bufferedReader.readLine())!= null){
                System.out.println(linha);
            }bufferedReader.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
