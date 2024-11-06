package aula06.exemplos;

public class Exemplo05_InteracoesFor {
    public static void main(String[] args) {
        int [] numero = {1,2,3,4,5};

        for (int i= 0; i < numero.length; i++){
            System.out.println("Posição" +i+ numero[i]);

        }
        String [] nomes = {"Rafael","Gisele","Lara"};
        for (int i= 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
