// Referente as Condicional composta e encadeada

public class ResultadoEscolar {
/*
public static void main(String[] args) {
        
        int nota = 6;

        if (nota >= 7){
            System.out.println("Aprovador");
        }else if(nota >= 5 && nota < 7)
            System.out.println("Prova Recuperação");
        else 
            System.out.println("Reprovador");
    }
*/
//------CONDICIONAL TERNÁRIA---------
    public static void main(String[] args) {
        int nota = 7;

        String resultado = nota >=7 ? "Aprovado" : nota >=5 ? "Recuperação" : "Reprovador";
        System.out.println(resultado
        );
    }
}
