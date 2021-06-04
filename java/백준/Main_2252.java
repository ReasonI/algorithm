import java.util.*;

public class Main_11729 {

    static int N;
    static int M;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();

        int[] edgesNum = new int[N + 1];

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < N + 1; i++) {
            graph.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < M; i++) {
            int v1 = scanner.nextInt();
            int v2 = scanner.nextInt();
            graph.get(v1).add(v2);
            edgesNum[v2]++;
        }

        topologicalSort(graph, edgesNum);
    }

    static void topologicalSort(ArrayList<ArrayList<Integer>> graph, int[] edgesNum) {
        Queue<Integer> queue = new LinkedList();

        for (int i = 1; i < N + 1; i++) {
            if (edgesNum[i] == 0) {
                queue.add(i);
            }
        }

        for (int i = 0; i < N; i++) {
            int v = queue.remove();
            System.out.print(v + " ");


            for (int nextV : graph.get(v)) {
                edgesNum[nextV]--;

                if (edgesNum[nextV] == 0) {
                    queue.add(nextV);
                }
            }
        }
    }

}