package aulas;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Log> c = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int num = sc.nextInt();
		
		for(int i=0; i < num; i++) {
			int pk = sc.nextInt();
			
			c.add(new Log(pk));
		}
		
		System.out.print("How many students for course B? ");
		num = sc.nextInt();
		
		for(int i=0; i < num; i++) {
			int pk = sc.nextInt();
			
			c.add(new Log(pk));
		}
		
		System.out.print("How many students for course C? ");
		num = sc.nextInt();
		
		for(int i=0; i < num; i++) {
			int pk = sc.nextInt();
			
			c.add(new Log(pk));
		}
		
		System.out.print("Total students: " + c.size());
		
		
		sc.close();
	}
}