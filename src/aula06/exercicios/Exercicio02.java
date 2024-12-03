package aula06.exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] letras = {"c", "o", "e", "l", "h", "o"};

        System.out.print("Digite uma letra:");
        String resposta = scanner.next();
        boolean presente = true;

        for (int i = 0; i < letras.length; i++) {
            if (letras[i].equals(resposta))
            {
                System.out.println("A letra " + resposta + "está presente no vetor e se encontra na posição " + i + " do vetor");
            }
            presente = false;

        }
        if (!presente) {
            System.out.println("Letra não encontrada no vetor");
        }
        scanner.close();
    }
}
