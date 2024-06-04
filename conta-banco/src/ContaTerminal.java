import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome");
        String nome = sc.nextLine();

        System.out.println("Digite o nome da sua agência");
        String agencia = sc.nextLine();

        System.out.println("Digite o número da sua conta");
        int conta = sc.nextInt();

        System.out.println("Digite o seu saldo");
        double saldo = sc.nextDouble();

        System.out.println(
            "Olá " + nome + "!\n" +
            "Confira os seus dados abaixo: \n" +
            "Agência: " + agencia + "\n" +
            "Conta: " + conta +  "\n" +
            "Saldo: " + saldo + "\n" +
            "Obrigado por criar uma conta em nosso banco!");

    }
}