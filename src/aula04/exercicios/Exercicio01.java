package aula04.exercicios;

import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {
        int idade;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe sua idade para ter acesso ao sistema");
        idade= scanner.nextInt();

        if (idade >= 18){
            System.out.println("Acesso permitido");
        }else{
            System.out.println("Acesso negado");
        }

    scanner.close();
    }
}
