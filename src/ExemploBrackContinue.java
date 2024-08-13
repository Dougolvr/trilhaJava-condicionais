public class ExemploBrackContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <=5; numero ++){
            if(numero == 3)
                continue; // ao chegar em 3 ele pula o numero e continua a contagem
                // break; Ao chegar em 3 ele para a contagem
            System.out.println(numero);
        }
    }
}
