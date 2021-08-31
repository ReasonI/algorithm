import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11724 {

    static int N, M;
    static int[][] graph;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int count = 0;

        graph = new int[N + 1][N + 1];
        visited = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());
            graph[a][b] = graph[b][a] = 1;
        }

        for (int i = 1; i < N + 1; i++) {

            if (visited[i]) continue;

            dfs(i);
            count++;
        }

        System.out.print(count);

    }

    public static void dfs(int node) {

        visited[node] = true;

        for (int i = 1; i < N + 1; i++) {
            if (graph[node][i] == 0 || visited[i]) continue;

            dfs(i);

        }

    }

}