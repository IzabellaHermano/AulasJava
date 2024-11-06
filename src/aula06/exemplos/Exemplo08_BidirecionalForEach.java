package aula06.exemplos;

public class Exemplo08_BidirecionalForEach {
    public static void main(String[] args) {
        int[][] matrizNumeros = {
                {0, 1, 2},
                {3, 4, 5},
                {6, 7, 8},
        };
        for (int[] matrizNumero : matrizNumeros) {
            for (int numero : matrizNumero) {
                System.out.println(numero);
            }
        }
        String[][] matrizNomes = {{"Rafael", "Gisele"}, {"Lara", "Luana"}};

        for (String[] matrizNome : matrizNomes){
            for (String nome : matrizNome) {
                System.out.println(nome);
            }
        }
    }
}
