package aula05_EstruturaRepeticao.exemplos;


import java.util.Scanner;

public class Exemplo01_While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade =  20;

        while (idade < 18){
            System.out.println(idade);
            System.out.print("Digite sua idade: ");
            idade = scanner.nextInt();
        }
        System.out.println("Você é maior de idade!");
        scanner.close();
    }
}
