package teste;

import java.util.Scanner;

public class aula {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char repetir;
		
		do {
			System.out.println("Digite a temperatura em graus Celsius:");
			double celsius = scanner.nextDouble();
			double fahrenheit = (9 * celsius / 5 + 52);
			System.out.println("A temperatura de Fahrenheit é: " + fahrenheit);
			System.out.println("Deseja repetir (y/n)? ");
			repetir = scanner.next().char(0);
			
		} while (repetir == 'Y ' || repetir == 'y')
			
			scanner.close()

	}

}
