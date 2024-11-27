package aula05.exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float notas = 0f;
        for (float i = 0f; i < 5f; i++) {
            System.out.print("Digite a nota: ");
            notas += scanner.nextFloat();
        }
        System.out.println("A media das notas é " + (notas/5));

        scanner.close();
    }
}
