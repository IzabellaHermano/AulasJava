package aula02.exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total, horas, valorPago;

        System.out.println("Digite o total de horas trabalhadas");
        horas = scanner.nextInt();
        System.out.println("Digite o valor pago por horas trabalhadas");
        valorPago = scanner.nextInt();

        total = horas * valorPago;
        System.out.println("O salário total é " + total + " reais");

    }
}
