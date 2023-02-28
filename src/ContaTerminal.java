import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //Trecho lê o nome do usuário.
        Scanner sNome = new Scanner(System.in);
        System.out.println("Primeiramente digite o seu nome: ");
        String nome = sNome.nextLine();

        //Trecho lê a agência da conta.
        Scanner sAgencia = new Scanner(System.in);
        System.out.println("Por favor, digite a sua agência: ");
        String agencia = sAgencia.nextLine();

        //Trecho lê o número da conta.
        Scanner sNumero = new Scanner(System.in);
        System.out.println("Agora digite o número da conta: ");
        int numero = sNumero.nextInt();

        //Trecho lê o saldo da conta.
        Scanner sSaldo = new Scanner(System.in);
        System.out.println("Informe o seu saldo: ");
        double saldo = sSaldo.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        System.out.println();


    }
}
