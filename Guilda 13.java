import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Digite o número de jogadores e o número de ações (N M):");
            int N = sc.nextInt(); // Número de jogadores
            int M = sc.nextInt(); // Número de ações

            if (N == 0 && M == 0) {
                break; // Condição de saída
            }

            int[] pontos = new int[N + 1]; // +1 para incluir Rafael (jogador 1)
            int[] guilda = new int[N + 1]; // Array que mapeia a guilda de cada jogador
            int vitorias = 0;

            System.out.println("Digite os pontos dos jogadores (separados por espaço):");
            for (int i = 1; i <= N; i++) {
                pontos[i] = sc.nextInt();
                guilda[i] = i; // Cada jogador pertence inicialmente à sua própria guilda
            }

            System.out.println("Digite as ações (Q A B) para cada ação:");
            for (int i1 = 0; i1 < M; i1++) {
                int Q = sc.nextInt(); // Tipo de ação
                int A = sc.nextInt(); // Jogador A
                int B = sc.nextInt(); // Jogador B

                if (Q == 1) {
                    // União entre duas guildas
                    int guildaA = guilda[A];
                    int guildaB = guilda[B];

                    if (guildaA != guildaB) {
                        for (int j = 1; j <= N; j++) {
                            if (guilda[j] == guildaA || guilda[j] == guildaB) {
                                guilda[j] = guildaA; // Ambas as guildas se unem em uma
                            }
                        }
                    }
                } else if (Q == 2) {
                    // Batalha entre duas guildas
                    if (pontos[A] > pontos[B]) {
                        if (guilda[A] == 1 || guilda[B] == 1) {
                            vitorias++; // Rafael participou e ganhou
                        }
                    }
                }
            }

            System.out.println("Número de vitórias de Rafael: " + vitorias);
        }

        sc.close();
    }
}