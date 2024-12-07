package aula06.exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double [] notas =new double[4];
        double soma= 0;

        System.out.println("Digite as notas: ");
        for (int i = 0; i < notas.length ; i++) {
            System.out.print("NOTA: ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];

        }
        double media = soma / notas.length;

        System.out.println(" A média das notas são: "+media);

        scanner.close();
    }
}
