package aula02.exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total, prova1, prova2, prova3;

        System.out.println("Digite a nota da primeira prova: ");
        prova1 = scanner.nextInt();
        System.out.println("Digite a nota da segunda prova: ");
        prova2 = scanner.nextInt();
        System.out.println("Digite a nota da terceira prova: ");
        prova3 = scanner.nextInt();
        total = prova1 + prova2 + prova3;

        System.out.println("A soma das notas é "+ total);

    }
}
