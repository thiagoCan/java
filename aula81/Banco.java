package aula81;

import java.util.Locale;
import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.println("Enter account number: ");
		String numero = sc.next();
		
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String titular = sc.nextLine();
		
		System.out.println("Is there an initial deposit (y/n)? ");
		char initialDeposit = sc.next().charAt(0);
		
		if(initialDeposit == 'y') {
			System.out.println("Enter initial deposit value: ");
			double balance = sc.nextDouble();
			conta = new Conta(numero, titular, balance);
		}
		else {
			conta = new Conta(numero, titular);
		}
		
		System.out.println("Account data:");
		System.out.println(conta.toString());
		
		System.out.println("Enter a deposit value:");
		double deposito = sc.nextDouble();
		conta.Deposit(deposito);
		
		System.out.println("Updated data:");
		System.out.println(conta.toString());
		
		System.out.println("Enter a withdrawal value:");
		double saque = sc.nextDouble();
		conta.withDrawal(saque);
		
		System.out.println("Updated data:");
		System.out.println(conta.toString());
		
		sc.close();
	}

}
