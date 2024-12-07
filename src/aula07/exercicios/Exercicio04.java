package aula07.exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        double retorno = converterCelsiusParaFahrenheit();
        System.out.println(retorno);

    }
    private static double converterCelsiusParaFahrenheit(){

        Scanner scanner = new Scanner(System.in);
        double celsius, fahrenheit;

        System.out.print("Digite o valor em graus Celsius: ");
        celsius = scanner.nextDouble();

        return fahrenheit= celsius* 1.8+32;
    }
}
