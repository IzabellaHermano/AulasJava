package aula07.exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        double retorno = calcularMedia();
        System.out.println(retorno);

    }
    private static double calcularMedia(){
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        int divisao = 3;

        for (int i = 1; i <= divisao; i++) {
            System.out.print("Digite a "+ i + " nota: ");
            double nota = scanner.nextDouble();
            soma +=nota;

        }

    return soma/divisao;

    }
}
