import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();

        List<List<Integer>> graph = new ArrayList<>(N);

        for (int i = 0; i < N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < N - 1; i++) {
            int Ai = sc.nextInt();
            int Bi = sc.nextInt();

            graph.get(Ai - 1).add(Bi);
            graph.get(Bi - 1).add(Ai);
        }

        for (int q = 0; q < Q; q++) {
            int Ci = sc.nextInt();
            int Di = sc.nextInt();

            int maxDistance = findMaxDistance(graph, Ci, Di);
            System.out.println(maxDistance);
        }
    }

    private static int findMaxDistance(List<List<Integer>> graph, int start, int target) {
        boolean[] visited = new boolean[graph.size()];
        return dfs(graph, start, target, visited);
    }

    private static int dfs(List<List<Integer>> graph, int current, int target, boolean[] visited) {
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