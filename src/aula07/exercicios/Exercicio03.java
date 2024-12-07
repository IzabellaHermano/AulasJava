package aula07.exercicios;

import java.util.Scanner;

public class Exercicio03 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int retorno = dobrar();
        System.out.println(retorno);

    }
    static int dobrar(){
        int num;

        System.out.print("Digite um numero inteiro: ");
        num = scanner.nextInt();

        return num*2;

    }
}
