public class ExemploForArray {
    public static void main(String[] args) {
        String alunos [] = {"DOUGLAS", "DANIELEN", "SAMUELEN", "JULIA", "INGRID"};

        for (int x=0; x<alunos.length; x++){
            System.out.println("o aluno no indice x= " + x + " é " + alunos[x]);
        }

        /*FORMA ABREVIADA
         *         for(String aluno : alunos){
         *  System.out.println("Nome do aluno é: " + aluno);
         * }
         */
        
        System.out.println("Fim da lista de alunos!");
    }
}


/*Enquanto x for menor que o tamanho(length) de alunos ele continua a execuçao
 * acrescentando 1
 */