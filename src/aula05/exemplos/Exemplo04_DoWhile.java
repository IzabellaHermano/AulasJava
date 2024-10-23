package aula05.exemplos;

import java.util.Scanner;

public class Exemplo04_DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opicao;

        do {

            System.out.println("Escolha uma opição");
            System.out.println("\t1 - para a Opição 1");
            System.out.println("\t2 - para a Opição 2");
            System.out.println("\t3 - para a Opição 3");
            System.out.println("\t4 - para sair");

            opicao = scanner.nextInt();
            switch (opicao) {
                case 1:
                    System.out.println("Parabéns, você escolheu a opição 1 ");
                    break;
                case 2:
                    System.out.println("Parabéns, você escolheu a opição 2 ");
                    break;
                case 3:
                    System.out.println("Parabéns, você escolheu a opição 3 ");
                    break;
                case 4:
                    System.out.println("Tchau");
                    break;
                default:
                    System.out.println("Opição inválida");

            }

        }while (opicao != 4) ;
    scanner.close();
    }
}
