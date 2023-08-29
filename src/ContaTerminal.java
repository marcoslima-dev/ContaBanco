import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Conta: ");
        int numero = sc.nextInt();
        System.out.print("Por favor, digite o número da Agência:");
        sc.nextLine();
        String agencia = sc.nextLine();
        System.out.print("Por favor, digite o seu Nome: ");
        String nome = sc.nextLine();
        System.out.print("Por favor digite o seu saldo inicial: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá "+ nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta "+numero+ " e seu saldo "+saldo+" já está disponível para saque");


        sc.close();
    }
}
