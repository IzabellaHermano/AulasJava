package aula04.Exemplos;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        int idade;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua idade");
        idade = scanner.nextInt();

        if (idade > 0 && idade <= 12) {
            System.out.println("Você é criança");

        } else if (idade > 12 && idade <= 17) {
            System.out.println("Você é adolescente");

        } else if (idade > 17 && idade < 65) {
            System.out.println("Você é adulto");

        }else if (idade >= 65 ) {
            System.out.println("Você é idoso");
        }else {
            System.out.println("Idade inválida");
        }
        scanner.close();
    }
}