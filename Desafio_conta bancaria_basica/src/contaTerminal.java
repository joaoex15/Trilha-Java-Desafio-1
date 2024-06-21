
import java.util.Locale;
import java.util.Scanner;

/**
 * contaTerminal
 */
public class contaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite o Numero da Conta:");
        int numero=sc.nextInt(); 
        
        System.out.println("Digite o Numero da Agencia:");
        String Agencia=sc.next();
        
        System.out.println("Digite o Seu nome:");
        String nome=sc.next();
        
        System.out.println("Digite o seu Saldo:");
        double Saldo=sc.nextDouble();

    
        System.out.println("Olá " +nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia +", conta " + numero + " e seu saldo "+ Saldo +" já está disponível para saque");
    }
    
    
}