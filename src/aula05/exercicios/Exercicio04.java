package aula05.exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero positivo inteiro:");
        int numero = scanner.nextInt();

        int divisao = 0;

        if (numero < 2) {
            System.out.print("O número" + numero + "não é primo");
        } else {

            for (int i = 1; i <= numero; i++)
                if (numero % i == 0) {
                    divisao++;
                }
        } if (divisao == 2){
            System.out.println(" O número "+ numero+ " é primo");

        }else{
            System.out.println(" O número "+numero+" não é primo");
        }
        scanner.close();
    }
}
