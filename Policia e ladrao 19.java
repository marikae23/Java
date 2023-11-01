import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de cidades e o número de consultas (N Q): ");
        int N = sc.nextInt(); // Número de cidades
        int Q = sc.nextInt(); // Número de consultas

        if (N > 1000 || Q > 1000) {
            System.out.println("Valores fora dos limites para pontuação máxima.");
            return;
        }

        List<List<Integer> > graph = new ArrayList<>(N);

        for (int i = 0; i < N; i++) {
            graph.add(new ArrayList<>());
        }

        System.out.println("Digite as rodovias livres (A B):");
        for (int i = 0; i < N - 1; i++) {
            int Ai = sc.nextInt();
            int Bi = sc.nextInt();

            graph.get(Ai - 1).add(Bi);
            graph.get(Bi - 1).add(Ai);
        }

        System.out.println("Digite as consultas (C D):");
        for (int q = 0; q < Q; q++) {
            int Ci = sc.nextInt();
            int Di = sc.nextInt();

            if (Ci != 1) {
                System.out.println("Valor de C fora dos limites para pontuação máxima.");
                return;
            }

            int maxDistance = findMaxDistance(graph, Ci, Di, N);
            System.out.println("Tempo máximo de fuga: " + maxDistance);
        }
    }

    private static int findMaxDistance(List<List<Integer> > graph, int start, int target, int N) {
        boolean[] visited = new boolean[N];
        return dfs(graph, start, target, visited);
    }

    private static int dfs(List<List<Integer> > graph, int current, int target, boolean[] visited) {
        if (current == target) {
            return 0;
        }

        visited[current - 1] = true;
        int maxDistance = -1;

        for (int neighbor : graph.get(current - 1)) {
            if (!visited[neighbor - 1]) {
                int distance = 1 + dfs(graph, neighbor, target, visited);
                maxDistance = Math.max(maxDistance, distance);
            }
        }

        visited[current - 1] = false;
        return maxDistance;
    }
}