import java.io.Console;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: meet and import the scanner class
        //TODO: Display messages to our user
        //TODO: Obtain the values ​​entered in the terminal via the scanner
        //TODO: Display the message "Account Created"

        Scanner terminal = new Scanner(System.in);

        int numero = 1021;
        String agencia = "067-8";
        String nomeCliente = "Mario Andrade";
        double decimal = 237.48;

        System.out.println("Digite o número da agência: " + agencia);
        System.out.println("Usuário: " + numero);

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + decimal + " já está disponível para saque");
        
    }
}
