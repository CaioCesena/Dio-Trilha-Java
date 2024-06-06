public class ExemploForArray {
    public static void main(String[] args) {
     /*    
        String alunos [] = {"CAIO", "FERNANDO","JULIA","MARCOS"};

        for (int x=0; x < alunos.length; x++){
            System.out.println("O aluno no indice x= " +x+ " é " +alunos[x]);
        }
            */

            String alunos [] = {"CAIO", "FERNANDO","JULIA","MARCOS"};

            for(String aluno : alunos ){
                System.out.println("Nome do aluno é: "+aluno);
            }
    }
}
