package aula08.exemplos;

import java.io.File;
import java.io.IOException;

public class Exemplo01_File {
    public static void main(String[] args) {
        File arquivo = new File("src\\aula08\\exemplos\\arquivo.txt");

        if(arquivo.exists()) {
            System.out.println("Arquivo já existe.");
        }else{
            try {
                if(arquivo.createNewFile()) {
                    System.out.println("Arquivo criado com sucesso:" + arquivo.getName());
                }else{
                    System.out.println("Erro em concluir a criação do arquivo");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
