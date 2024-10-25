package aula04.exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int codigo;
        do {
            System.out.println("Menu:");
            System.out.println("\t 1 - 234");
            System.out.println("\t 2 - 341");
            System.out.println("\t 3 - 421");
            System.out.println("\t 4 - para sair");

            codigo = scanner.nextInt();

            switch (codigo){
                case 1:
                    System.out.println("Eletônico");
                    break;
                case 2:
                    System.out.println("Alimento");
                    break;
                case 3:
                    System.out.println("Vestúario");
                    break;
                case 4:
                    System.out.println("Encerrando Programa");
                    break;
                default:
                    System.out.println("Opição inválida");
                    break;
            }

        }while (codigo !=4);


    scanner.close();
    }
}
