package aula02.exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        float total, altura, largura;

        System.out.print("Digite a altura:");
        altura = scanner.nextFloat();
        System.out.println("Digite a largura:");
        largura = scanner.nextFloat();

        total= altura * largura;
        System.out.println(" A área é " +total);

    }
}
