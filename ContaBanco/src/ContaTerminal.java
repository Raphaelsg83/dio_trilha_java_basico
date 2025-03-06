import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite Numero: ");
        int numero = scanner.nextInt();

        System.out.print("Digite agencia: ");
        String agencia = scanner.next();

        System.out.print("Digite seu nome: ");
        String nome = scanner.next();

        System.out.print("Digite seu saldo: ");
        double saldo = scanner.nextDouble();
        
        System.out.println("Olá " + nome + "!");

        System.out.println("Obrigado por criar uma conta em nosso banco, " + "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + "R$ " + saldo + " já está disponível para saque.");


    }
}
