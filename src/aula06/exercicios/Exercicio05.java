package aula06.exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = {"Helena", "Benício", "Flor"};

        System.out.print("Digite o nome que deseja verificar: ");
        String resposta = scanner.next();
        boolean presente = true;

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals(resposta))
            {
                System.out.println("O nome " + resposta + " está presente no vetor e esta na posição " + i );
            }
            presente = false;

        }
        if (!presente) {
            System.out.println("Nome não encontrada no vetor");
        }
        scanner.close();
    }
}
