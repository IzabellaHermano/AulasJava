package aula07.exemplos;

public class Exemplo03_InvocandoFuncaoComParametroComRetorno {
    public static void main(String[] args) {
        int retorno = funcaoComParametroComRetorno(2,4);
        System.out.println(retorno);

    }
    static int funcaoComParametroComRetorno ( int num01,int num02){
        System.out.println("A seguir o resultado ");

        return num01+num02;
    }
}
