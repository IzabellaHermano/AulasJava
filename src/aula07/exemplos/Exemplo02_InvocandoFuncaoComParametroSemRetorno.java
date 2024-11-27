package aula07.exemplos;

public class Exemplo02_InvocandoFuncaoComParametroSemRetorno {
    public static void main(String[] args) {
        funcaoComParametroSemRetorno(5,"Teste!");
        System.out.println("teste");
    }
    public static void funcaoComParametroSemRetorno(int parametro01,String parametro02){
        System.out.println("Paramêtro 01 = "+ parametro01);
        System.out.println("Paramêtro 02 = "+ parametro02);
    }
}


