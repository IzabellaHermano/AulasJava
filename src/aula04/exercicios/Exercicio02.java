package aula04.exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da compra ");

        float valorCompra = scanner.nextFloat();
        float valorFinal, desconto = 0.1f;

        valorFinal = valorCompra > 100.0f ? valorCompra - valorCompra* desconto : valorCompra;

        System.out.println("O valor total da compra é " + valorFinal);

    scanner.close();

    }
}
