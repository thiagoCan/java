package gerson2;

import java.util.Locale;
import java.util.Scanner;

import gerson3.DescontoTipoA;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o nome do produto: ");
		String nome = sc.nextLine();
		
		System.out.print("Digite valor do produto: ");
		double valorProduto = sc.nextDouble();
		
		CalculadorPreco cp = new CalculadorPreco(valorProduto, new DescontoTipoA());
		
		PrecoFinal pf = new PrecoFinal(new Produto(nome));
		
		cp.ProcessarDesconto(pf);
		
		System.out.println("valor com desconto: " + String.format("%.2f", pf.valorTotal()));
		//System.out.print("desc = " + pf.getDesc());
		
		sc.close();
	}

}
