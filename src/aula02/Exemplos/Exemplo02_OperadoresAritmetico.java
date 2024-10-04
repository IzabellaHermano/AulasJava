package aula02.Exemplos;

public class Exemplo02_OperadoresAritmetico {
    public static void main(String[] args) {
        int total, num1= 2, num2=4;

        total= num1 + num2;
        System.out.println("o total da soma é " + total);
        total= num1 - num2;
        System.out.println("o total da subtração é " + total);
        total= num1 * num2;
        System.out.println("o total da multiplicação é " + total);

        float totalFloat, numFloat1 = 2, numFloat2 = 4;
        totalFloat = numFloat1 / numFloat2;
        System.out.println("o total é divisão é " + totalFloat);

        int total2, nume1 =2, nume2= 4;

        total2= nume1 % nume2;

        System.out.println("o resto da divisão de " + nume1 + "por" + nume2 + "=" + total2);


    }
}
