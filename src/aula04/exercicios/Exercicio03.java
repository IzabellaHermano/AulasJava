package aula04.exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int codigo;
        do {
            System.out.println("Escolha uma opição");
            System.out.println("\t1 - para Eletrônicos");
            System.out.println("\t2 - para Alimentos");
            System.out.println("\t3 - para Vestúario");
            System.out.println("\t4 - para sair");

            codigo = scanner.nextInt();

            switch (codigo){
                case 1:
                    System.out.println("Eletônicos: \n -Computador \n - Televisão \n -Smartfone \n - Impressora" );
                    break;
                case 2:
                    System.out.println("Alimentos: \3n - Frutas \n -Legumes \n -Verduras \n -Proteina Animal");
                    break;
                case 3:
                    System.out.println("Vestúario; \n - Camiseta \n -Calça \n - Meias \n - Agasalho");
            }

        }while (codigo !=4);


    scanner.close();
    }
}
