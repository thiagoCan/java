package gerson4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Kit {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Kit ou unitário (k/u)? ");
		Character ch = sc.next().charAt(0);

		ch = Character.toLowerCase(ch);

		if (ch == 'k') {
			String path = "C:\\Users\\Thiago Fernandes\\OneDrive - Fatec Centro Paula Souza\\Documents\\Engenharia de Software 3\\kit.txt";

			List<KitProduto> list = new ArrayList<>();

			try (BufferedReader br = new BufferedReader(new FileReader(path))) {

				String line = br.readLine();

				while (line != null) {

					String[] fields = line.split(",");
					String nome = fields[0];
					double preco = Double.parseDouble(fields[1]);

					list.add(new KitProduto(nome, preco));

					line = br.readLine();
				}
				double sum = 0.0;
				for (KitProduto item : list) {
					sum += item.getPreco();

				}
				//System.out.println(sum);
				
				CalculadorPreco cp = new CalculadorPreco(sum, new DescontoTipoB());
				PrecoFinal pf = new PrecoFinal();
				
				cp.ProcessarDesconto(pf);
				
				System.out.println("valor com desconto: " + String.format("%.2f", pf.valorTotal()));
				
			} catch (IOException e) {
				System.out.println("Error: " + e.getMessage());
			}
		} else {
			System.out.print("Digite o nome do produto: ");
			String nome = sc.nextLine();
			sc.nextLine();
			System.out.print("Digite valor do produto: ");
			double valorProduto = sc.nextDouble();

			CalculadorPreco cp = new CalculadorPreco(valorProduto, new DescontoTipoA());

			PrecoFinal pf = new PrecoFinal(new Produto(nome));

			cp.ProcessarDesconto(pf);

			System.out.println("valor com desconto: " + String.format("%.2f", pf.valorTotal()));
		}
		
		sc.close();
	}
}
