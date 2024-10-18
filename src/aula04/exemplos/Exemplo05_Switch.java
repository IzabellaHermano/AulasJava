package aula04.exemplos;

import java.util.Scanner;
public class Exemplo05_Switch {
    public static void main(String[] args) {
        int opicao;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opição");
        System.out.println("\t1 - para a Opição 1");
        System.out.println("\t2 - para a Opição 2");
        System.out.println("\t3 - para a Opição 3");

        opicao= scanner.nextInt();
        switch (opicao){
            case 1:
                System.out.println("Parabéns, você escolheu a opição 1 ");
                break;
            case 2:
                System.out.println("Parabéns, você escolheu a opição 2 ");
                break;
            case 3:
                System.out.println("Parabéns, você escolheu a opição 3 ");
                break;
            default:
                System.out.println("Opição inválida");
        }
    scanner.close();
    }
}
