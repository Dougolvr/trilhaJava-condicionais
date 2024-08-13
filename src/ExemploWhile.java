import java.util.concurrent.ThreadLocalRandom; //classe para simular valores aleatorios

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while(mesada>0) {
            double valorDoce = valorAleatorio();

            if(valorDoce > mesada)
                    valorDoce = mesada;
                    // Se o valor do doce for maior que a mesada, retornara o valor da mesada. Para que não retorne valor negativo

            System.out.println("Valor do doce: " + valorDoce + " adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
    }
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
        /* ThreadLocalRandom para retornar um valor entre 2 e 8*/
    }
}
