package aula04.exemplos;

import java.util.Scanner;

public class Exemplo02_IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String corSemafaro;

        System.out.println("Digite a cor do semáfaro");
        corSemafaro = scanner.nextLine();

        if (corSemafaro.equals("verde") || corSemafaro.equals("Verde")) {
            System.out.println("Siga");
        } else if (corSemafaro.equals("amarelo")|| corSemafaro.equals("Amarelo")) {
            System.out.println("Atenção");
        } else if (corSemafaro.equals("vermelho") || corSemafaro.equals("Vermelho")) {
            System.out.println("Pare");
        } else {
            System.out.println("Cor Inválida");

        }
        scanner.close();
    }
}
