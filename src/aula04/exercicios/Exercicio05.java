package aula04.exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double horasTraba, horasExtras, valorPag = 50, valorPagExtra, total, totalExtra;

        System.out.println("Digite o total de horas trabalhadas");
        horasTraba = scanner.nextInt();
        if (horasTraba> 40){
            valorPagExtra = 0.5;
            total = horasTraba * valorPag;
            totalExtra = total *valorPagExtra;
            horasExtras = total + totalExtra;

            System.out.println("O valor pago pelas suas horas trabalhadas é "+ horasExtras);

        }else {
            total = horasTraba * valorPag;
            System.out.println("O valor pago pelas suas horas trabalhadas é "+ total);


        }
        scanner.close();
    }
}
