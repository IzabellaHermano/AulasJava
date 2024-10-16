package aula04.Exemplos;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String corSemafaro;

        System.out.println("digite uma cor");
        corSemafaro = scanner.nextLine();

        if (corSemafaro == "verde") {
            System.out.println("siga");
        } else if (corSemafaro == "amarelo") {
            System.out.println("atenção");
        } else if (corSemafaro == "vermelho") {
            System.out.println("pare");
        } else {
            System.out.println("cor invalida");

        }
    }
}
