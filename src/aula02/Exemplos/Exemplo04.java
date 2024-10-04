package aula02.Exemplos;

public class Exemplo04 {
    public static void main(String[] args) {
        int num1 = 2, num2= 4, num3= 6, num4= 7;
        boolean resposta;

        resposta = num1 < num2 && num3 != num4;
        System.out.println(num1 + " < " + num2 + " && " + num3 + num4 + " = " + resposta);

        resposta = num1 < num2 || num3 != num4;
        System.out.println(num1 + " < " + num2 + " || " + num3 + num4 + " = " + resposta);



    }
}
