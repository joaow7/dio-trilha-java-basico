import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.println("Digite sua agencia: ");
        String agencia = input.next();

        System.out.println("Digite sua conta: ");
        int conta = input.nextInt();

        System.out.println("Insira um valor de saldo: ");
        double saldo = input.nextDouble();


        System.out.println(
                "Olá ,"
                + nome + " obrigado por criar uma conta em nosso banco, sua agência é ,"
                + agencia + " conta "
                + conta + " e seu saldo de "
                + saldo + " já está disponível para saque"
        );
    }
}