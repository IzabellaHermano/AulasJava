package aula02.Exemplos;

import java.util.Scanner;

public class Exemplo06_CastingScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite um número inteiro: ");
        int varInt = scanner.nextInt();
        System.out.println("voce digitou o numero: " + varInt);
        short varShort = (short) varInt;
        System.out.println("varShort = "+ varShort);
        byte varByte = (byte) varShort;
        System.out.println("varByte = "+ varByte);

        System.out.println("digite um numero decimal:");
        double varDouble = scanner.nextDouble();
        System.out.println("voce digitou o numero: " + varDouble);
        float varFloat = (float) varDouble;
        System.out.println("varFloat = "+ varFloat);

        varInt = (int) varFloat;
        System.out.println( " varInt = " +varInt);

        scanner.close();
    }
}
