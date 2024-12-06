package aula06.exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean[] posicao = new boolean[8];
        int total = 0;

        System.out.println("Digite 8 variações de TRUE or FALSE: ");

        for (int i = 0; i < posicao.length; i++) {
            System.out.println("TRUE OR FALSE: ");
            posicao[i] = scanner.nextBoolean();

            if (posicao[i]) {
                total++;
            }

        }
        System.out.println(" A quantidade de TRUE que foram digitados foram "+ total);

        scanner.close();

    }
}
