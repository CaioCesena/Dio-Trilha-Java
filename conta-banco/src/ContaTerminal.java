import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        
        
         
        double saldo = 5000.50;

        System.out.println("Digite seu nome completo: ");
        String nome = entrada.nextLine();
        System.out.println("Digite o número da sua agencia: ");
        String agencia = entrada.nextLine();
        System.out.println("Digite o número da sua conta: ");
        int numero = entrada.nextInt();

        System.out.println("Olá "+ nome);
        System.out.println("Sua agencia é: "+ agencia);
        System.out.println("Sua conta é: "+ numero);
        System.out.println("Seu saldo é: " + saldo);
        entrada.close();
    }
}
