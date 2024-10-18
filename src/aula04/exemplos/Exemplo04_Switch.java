package aula04.exemplos;

import java.util.Scanner;
public class Exemplo04_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String corSemafaro;
        System.out.println("Digite a cor do semáfaro");
        corSemafaro= scanner.nextLine();

        switch (corSemafaro) {
            case "verde","Verde" :
                System.out.println("Siga");
                break;

            case "amarelo", "Amarelo":
                System.out.println("Atenção");
                break;

            case "vermelho", "Vermelho":
                System.out.println("Pare");
                break;

            default:
                System.out.println("Nunca vi um semáfaro com a cor "+ corSemafaro);
        }
    scanner.close();
    }
}
