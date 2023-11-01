package aulas;
import java.util.Scanner;
import java.util.Locale;

public class Aulas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			if (N == 0 && M == 0) {
				break;

			}
			
			int[] pontos = new int[N + 1];
			int[] guilda = new int[N + 1];
			for (int i = 1; i <= N; i++) {
				pontos[i] = sc.nextInt();
				guilda[i] = i;
				int vitorias = 0;
				for(int i1 = 0 ; i1 < M; i1++) {
					int Q = sc.nextInt();
					int A = sc.nextInt();
					int B = sc.nextInt();
					if (Q == 1) {
						int guildaA = guilda[A];
						int guildaB = guilda[B];
						if (guildaA != guildaB) {
							for(int j = 1; j <= N; j++);
							if(guilda[i1] == guildaA || guilda[i1] == guildaB) {
								guilda[i1] = guildaA;
								
							}
						}
					}
					
				} else if (i == 2) {
					if(pontos[A] > pontos[B]) {
						vitorias++;
					}
				}
			}
			
			System.out.println("vitorias");
		}
		
		sc.close();
		
	}

}
