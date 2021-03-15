package aulas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Map<String, Integer> urna = new LinkedHashMap<>();

		System.out.println("Digite o caminho do arquivo: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {
				
				String[] fields = line.split(",");

				String nome = fields[0];
				int votos = Integer.parseInt(fields[1]);

				if (!urna.containsKey(nome)) {
					urna.put(nome, votos);
				} else {
					int votosSeguintes = urna.get(nome);
					urna.put(nome, votos + votosSeguintes);
				}
				line = br.readLine();
			}
			
			for (String key : urna.keySet()) {
				System.out.println(key + ": " + urna.get(key));
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}
}