package Exer;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data");
			
			System.out.print("Number: ");
			Integer number = sc.nextInt();
			
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			
			System.out.print("Initial balance: ");
			Double balance = sc.nextDouble();
			
			System.out.print("Withdraw limit: ");
			Double withdrawLimit = sc.nextDouble();
			
			Conta cb = new Conta(number, holder, balance, withdrawLimit);
			
			System.out.print("\nEnter amount for withdraw: ");
			Double amount = sc.nextDouble();
			
			cb.withdraw(amount);
			
			System.out.println(cb);
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
			
		}
		
		sc.close();
	}

}
