package aula07.exercicios;

import java.util.Scanner;

public class Exercicio02 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int retorno = soma();
        System.out.println(retorno);

    }
    static int soma(){
        int num01, num02;

        System.out.print("Digite um numero inteiro: ");
        num01 = scanner.nextInt();
        System.out.print("Digite um numero inteiro: ");
        num02 = scanner.nextInt();

        return num01+num02;
    }
}
