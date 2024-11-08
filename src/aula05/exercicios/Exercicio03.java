package aula05.exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, fatorial =1;

        System.out.print("Digite um numero inteiro: ");
        num = scanner.nextInt();

        do {
            fatorial *= num;{
                num--;
            }
        }while ( num != 1);
        System.out.println("O fatorial é " + fatorial);
    }
}
