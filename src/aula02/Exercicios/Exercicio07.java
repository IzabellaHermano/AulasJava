package aula02.Exercicios;

public class Exercicio07 {
    public static void main(String[] args) {
        int num1= 2, num2 =6, num3=4, num4 = 5;
        boolean cond1, cond2, cond3;

        cond1 = num1 != num2 && num3 <= num4;
        cond2 = num1 > num2 && num3 >= num4;
        cond3 = num1 < num2 || num3 == num4;

        System.out.println("A primeira condição é: "+ cond1);
        System.out.println("A segunda condição é: "+ cond2);
        System.out.println("A terceira condição é: "+ cond3);

    }
}
