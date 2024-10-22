package aula04.exemplos;

public class Exemplo07_OperadorTernario {
    public static void main(String[] args) {

        float valorCompra = 90.50f;
        float desconto = 0.2f;
        float valorFinal;

        valorFinal = valorCompra > 100.0f ? valorCompra - valorCompra* desconto : valorCompra;

        System.out.println(valorFinal);
    }
}
