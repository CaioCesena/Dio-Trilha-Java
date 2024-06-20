import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // Leitura dos parâmetros
            System.out.print("Digite o primeiro número: ");
            int parametroUm = scanner.nextInt();
            System.out.print("Digite o segundo número: ");
            int parametroDois = scanner.nextInt();
            
            // Validação dos parâmetros
            if (parametroUm >= parametroDois) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }
            
            // Execução da lógica principal
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static void contar(int parametroUm, int parametroDois) {
        int quantidadeIteracoes = parametroDois - parametroUm;
        for (int i = 1; i <= quantidadeIteracoes; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}