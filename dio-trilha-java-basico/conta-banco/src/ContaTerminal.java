import java.util.Scanner;

public class ContaTerminal {
	
	public static void main(String args[]) throws Exception {
		
		Integer accountNumber;
		String agency;
		String customerName;
		Float balance;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, digite às informações da sua conta: ");
		
		System.out.println("Número da conta: ex: 1021: ");	
		accountNumber = sc.nextInt();
		System.out.println("Digite o número da agência ex: 067-8: ");
		agency = sc.next();
		System.out.println("Digite o nome do cliente: ex: MARIO ANDRADE: ");
		customerName = sc.next();
		System.out.println("Digite o saldo da sua conta: ex: 237.48: ");
		balance = sc.nextFloat();
		
		System.out.println("Olá " + customerName+", obrigado por criar uma conta em nosso banco, sua agência é " + agency + ", conta "+ accountNumber +" e seu saldo "+ balance +" já está disponível para saque");
			
		sc.close();		
	}

}

