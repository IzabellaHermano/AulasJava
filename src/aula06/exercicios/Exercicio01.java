package aula06.exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numeros = new int[5];
        int soma = 0;

        System.out.println("Digite 5 números inteiros:");

        
        for(int i=0; i < numeros.length; i++){
            System.out.print("Numero " + (i +1)+ ":");
            numeros[i]= scanner.nextInt();
            soma += numeros[i];
        }
        System.out.println("A soma dos numeros é "+ soma);
        
        scanner.close();
        

    }
}
