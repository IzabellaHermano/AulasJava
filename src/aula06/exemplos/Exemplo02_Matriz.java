package aula06.exemplos;

public class Exemplo02_Matriz {
    public static void main(String[] args) {
        int [] [] matrizNumero = new int[2][3];

        matrizNumero[0][0]=1;
        matrizNumero[0][1]=2;
        matrizNumero[0][2]=3;
        matrizNumero[1][0]=4;
        matrizNumero[1][1]=5;
        matrizNumero[1][2]=6;

        System.out.println("Valor da posição [0][2] = " + matrizNumero [0][2]);
    }

}



