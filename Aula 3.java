package aulas;

public class Aulasjava {

	public static void main(String[] args) {
		int numero = 10;
		if(eMultiploDe2(numero)) {
			System.out.println(numero + " é um multiplo de 2");
		} else {
			System.out.println(numero + " não é múltiplo de 2");
		}

	}
	
	public static boolean eMultiploDe2(int numero) {
		return numero %2 == 0;
	}

}

﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏

package aulas;

import java.util.Scanner;

public class Aulasjava {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Digite uma string: ");
			String inputString = scanner.nextLine();
			System.out.println("Digite a letra que deseja substituir: ");
			char letraAlvo = scanner.next().charAt(0);
			
			System.out.println("Digite uma letra de substituição: ");
			char letraSubstituta = scanner.next().charAt(0);
			String novaString = substituirLetra(inputString, letraAlvo, letraSubstituta);
			System.out.println("Stringapós a substituição: " + novaString);
		}
	}
	public static String
	substituirLetra(String input, char alvo, char substituto) {
		return input.replace(alvo, substituto);
	}

}
