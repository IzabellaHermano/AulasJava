package aula05.exercicios;

import java.util.Timer;

public class Exercicio01 {
    public static void main(String[] args) throws InterruptedException {
        for ( int x = 10; x >= 1; x--){
            System.out.println(x);
            Thread.sleep(2000);
        }
        System.out.println("FIM!!");
    }
}
