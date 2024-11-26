package aula08.exemplos;

public class Exemplo04_Tokenização {
    public static void main(String[] args) {
        String linha = "ID:1;NOME:Nicoly;IDADE:105";

        String[] tokens = linha.split(";");

        for(String token : tokens){
            System.out.println(token);
        }

        String[] idade = tokens[2].split(":");

       int valorIdade = Integer.parseInt(idade[1]);
       double idadeDouble = Double.parseDouble(idade[1]);

       idadeDouble = 2.5 *3;

        System.out.println(valorIdade+1);
        System.out.println("Idade Double = "+idadeDouble);

    }
}
