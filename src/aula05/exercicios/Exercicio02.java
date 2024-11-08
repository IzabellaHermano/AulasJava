package aula05.exercicios;

public class Exercicio02 {
    public static void main(String[] args) {
        int num = 1, par =0;

        while (num <= 100 ){
            if (num % 2 ==0  ){
                par += num;
            }num ++;
        }
        System.out.println(par);
    }
}
