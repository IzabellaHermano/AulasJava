package aula04.Exemplos;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String corSemafaro;

        System.out.println("Digite a cor do semáfaro");
        corSemafaro = scanner.nextLine();

        if (corSemafaro == "verde") {
            System.out.println("Siga");
        } else if (corSemafaro == "amarelo") {
            System.out.println("Atenção");
        } else if (corSemafaro == "vermelho") {
            System.out.println("Pare");
        } else {
            System.out.println("Cor Inválida");

        }
    }
}
