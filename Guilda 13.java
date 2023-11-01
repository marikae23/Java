Rafael está jogando um novo e excitante jogo de RPG, e acaba de notar a existência de algo chamado Guilda. Para aqueles que não sabem, Guilda se trata de um grupo de jogadores que se unem com um objetivo em comum dentro do jogo, tirando assim vantagem do trabalho em equipe.

O jogo que Rafael joga tem um sistema de GVG (Guilda versus Guilda) bem disputado, e logo percebeu que deveria tomar algumas providencias para se sair bem nessas batalhas.

O sistema de GVG funciona da seguinte maneira: a batalha acontece entre duas guildas, e vence a guilda que tiver o maior número de pontos. O número de pontos de uma guilda é dado pela soma do número de pontos de todos os jogadores presentes na guilda. Cada jogador tem um número de pontos, que corresponde ao seu nível atual.

Considere que inicialmente, todos os jogadores fazem parte de uma guilda, contendo apenas o próprio jogador. A união entre duas guildas faz com que todos os jogadores de ambas as guildas passem a participar apenas de uma guilda, e a outra deixa de existir.

Dada uma lista de ações no decorrer do jogo, entre elas união entre duas guildas e batalhas entre duas guildas, diga o número de vezes em que a guilda em que Rafael estava saiu vitoriosa de uma batalha.

Entrada
Haverá diversos casos de teste. Cada caso de teste inicia com dois inteiros N e M, representando o número de jogadores dentro do jogo, e o número de ações no decorrer do jogo, respectivamente.

Em seguida haverá N inteiros Pi​, onde o i-ésimo inteiro representa o número de pontos que o i-ésimo jogador tem, para todo 1≤i≤N. Rafael é o jogador número 1, sempre.

Em seguida, haverá M linhas, contendo três inteiros cada, Q, A e B, representando o tipo da ação, e as duas guildas envolvidas na ação. Se Q for igual a 1, significa que a guilda que contém o jogador A e a guilda que contém o jogador B estão se unindo. Se Q for igual a 2, significa que a guilda que contém o jogador A e a guilda que contém o jogador B participarão de uma batalha.
O último caso de teste é indicado quando N = M = 0, o qual não deverá ser processado.

Saída
Para cada caso de teste imprima uma linha, contendo um inteiro, indicando o número de batalhas em que a guilda em que Rafael está participando ganhou uma batalha. Note que empates não são considerados vitórias

package aulas;
import java.util.Scanner;
import java.util.Locale;

public class Aulas {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        while (true) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            if (N == 0 && M == 0) {
                break;
            }

            int[] pontos = new int[N + 1];
            int[] guilda = new int[N + 1];
            int vitorias = 0;

            for (int i = 1; i <= N; i++) {
                pontos[i] = sc.nextInt();
                guilda[i] = i;
            }

            for (int i1 = 0; i1 < M; i1++) {
                int Q = sc.nextInt();
                int A = sc.nextInt();
                int B = sc.nextInt();

                if (Q == 1) {
                    int guildaA = guilda[A];
                    int guildaB = guilda[B];

                    if (guildaA != guildaB) {
                        for (int j = 1; j <= N; j++) {
                            if (guilda[j] == guildaA || guilda[j] == guildaB) {
                                guilda[j] = guildaA;
                            }
                        }
                    }
                } else if (Q == 2) {
                    if (pontos[A] > pontos[B]) {
                        if (guilda[A] == 1 || guilda[B] == 1) {
                            vitorias++;
                        }
                    }
                }
            }

            System.out.println(vitorias);
        }

        sc.close();
    }
}
