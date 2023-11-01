package aulas;
import java.util.Scanner;
import java.util.Locale;

public class Aulas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual a sequencia? ");
		int n = sc.nextInt();
		int stateA = 0;
		int stateB = 0;
		for(int i = 0; i < n; i++ ) {
			int switchPressed = sc.nextInt();
			if (switchPressed  == 1) {
				stateA = 1 - stateA;
			} else if (switchPressed == 2) {
				stateA = 1 - stateA;
				stateB = 1 - stateB;
			}
			
		}
		
		System.out.printf(stateA + " " + stateB);
		
		sc.close();
		

	}

}
