package aula04.exercicios;


import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vendas, comissao, valorTotal, comissaoDouble;

        System.out.println("Insira o valor das vendas");
        vendas = scanner.nextInt();
        if (vendas < 1000) {
            comissao = 0.5;
            comissaoDouble = vendas * comissao;
            valorTotal = vendas + comissaoDouble;
            System.out.println("A comissão foi de R$ " + valorTotal );
        } else if (vendas >= 1000 &&  vendas<= 5000) {
            comissao = 0.1;
            comissaoDouble = vendas* comissao;
            valorTotal = vendas + comissaoDouble;
            System.out.println("A comissão foi de R$ "+ valorTotal);

        } else if (vendas > 5000) {
            comissao = 0.15;
            comissaoDouble= vendas* comissao;
            valorTotal = vendas + comissaoDouble;
            System.out.println("A comissão foi de R$"+ valorTotal);
        }
        scanner.close();
    }
}