package aula06.exemplos;

//Caso não utilizar o indice no codigo
public class Exemplo06_InteracoesForEach {
    public static void main(String[] args) {
        int [] numeros = {1,2,3,4,5};

        for (int numero : numeros) {
            System.out.println(numero);

        }
        String [] nomes = {"Rafael","Gisele","Lara"};
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
