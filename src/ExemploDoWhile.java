import java.util.Random; // Auxilia na simulação

public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");

        do {
            System.out.println("Telefone tocando");
                //executa varias vezes ate alguem atender
        } while(tocando());
        
        System.out.println("Alô !!!");

    }
    public static boolean tocando() {
        boolean atendeu = new Random().nextInt(3)==1;
                        /*Se no valor aleatorio entre 1 e 3 for igual a 1,
                         * quer dizer que ele atendeu.
                        */

        System.out.println("Atendeu? " + atendeu);

        return ! atendeu; // ! nega o ato de continuar tocando
    }
}
