package aula02.exemplos;
import java.util.Scanner;
public class Exemplo05_Casting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro");
        int numero = scanner.nextInt();
        long varLong = numero;
        float varFloat = numero;
        double varDouble = numero;


        System.out.println("o numero que voce digitou é:" + numero);
        System.out.println("varLong =" + varLong);
        System.out.println("varFloat =" + varFloat);
        System.out.println("varDouble =" + varDouble);

        System.out.println("Digite um numero decimal");
        varFloat = scanner.nextFloat();
        System.out.println("o numero que voce digitou é:" + varFloat);

        varDouble = varFloat;
        System.out.println("varDouble =" + varDouble);

        scanner.close();
    }
}
