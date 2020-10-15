package aula90;

import java.util.Scanner;

public class Quarto {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N;
		
		System.out.println("How many rooms will be rented? ");
		N = sc.nextInt();
		
		Aluguel[] alu = new Aluguel[10];
		
		String estudante;
		String email;
		int quarto;
		
		for(int i=0; i<N; i++) {
			sc.nextLine();
			System.out.printf("Rent #%d:\n", i+1);
			System.out.println("Name: ");
			estudante = sc.nextLine();
			
			System.out.println("email: ");
			email = sc.nextLine();
			
			System.out.println("Room: ");
			quarto = sc.nextInt();
			
			//Guardar na posição do quarto
			alu[quarto] = new Aluguel(estudante, email, quarto);
			
			
		}
		
		for(int i=0; i<alu.length; i++) {
			if(alu[i] != null) {
				System.out.println("Busy rooms:");
				System.out.println(alu[i].toString());
			}
		}
		
		sc.close();
	}
}
