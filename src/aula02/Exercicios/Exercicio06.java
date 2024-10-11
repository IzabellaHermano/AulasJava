package aula02.Exercicios;

public class Exercicio06 {
    public static void main(String[] args) {
        int num1= 9, num2= 5;
        boolean resposta;

        resposta = num1 > num2;
        System.out.println(num1 + " > " + num2 + " = " + resposta);

        resposta = num1 < num2;
        System.out.println(num1 + " < " + num2 + " = " + resposta);

        resposta = num1 >= num2;
        System.out.println(num1 + " >= " + num2 + " = " + resposta);

        resposta = num1 <= num2;
        System.out.println(num1 + " <= " + num2 + " = " + resposta);

        resposta = num1 == num2;
        System.out.println(num1 + " == " + num2 + " = " + resposta);

        resposta = num1 != num2;
        System.out.println(num1 + " != " + num2 + " = " + resposta);
    }
}
