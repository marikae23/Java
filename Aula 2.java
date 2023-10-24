package aulasjava;

import java.util.Scanner;

public class Aulas {

	public static void main(String[] args) {
		 @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		 double nota = sc.nextDouble();
		 System.out.println("Digite a nota: ");
		 if(nota > 5) {
			 System.out.println("Você foi aprovado!");
			 
		 } else {
			 
			 System.out.println("Você foi reprovado!");
		 }
		
	}

}
