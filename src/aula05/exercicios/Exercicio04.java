package aula05.exercicios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero positivo inteiro:");
        int numero = scanner.nextInt();

        if (numero < 2){
            System.out.print("O número" + numero+ "não é primo");
        }else {
            int divisao = 0;

            for (int i = 1; i <= numero; i++)
            if (numero % i == 0){
                divisao++;


            }

        }

    }
}
