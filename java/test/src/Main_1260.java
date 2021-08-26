import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1260 {
    static int[][] graph;

    static boolean[] visited;
    static int N, edgeNum, V;

    static Queue<Integer> bfsQ = new LinkedList<Integer>();

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        edgeNum = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        visited = new boolean[N + 1];
        graph = new int[N + 1][N + 1];


        //그래프 만들기
        for (int i = 1; i < edgeNum + 1; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());

            graph[a][b] = 1;
            graph[b][a] = 1;
        }


        //dfs 실행
        dfs(V);
        System.out.println("");

        //bfs 실행
        Arrays.fill(visited, false);
        bfs(V);

    }

    private static void dfs(int i) {
        visited[i] = true;

        System.out.print(i + " ");
        for (int j = 1; j < N + 1; j++) {
            if (graph[i][j] == 1 && !visited[j]) {
                dfs(j);
            }
        }


    }

    private static void bfs(int i) {
        visited[i] = true;

        bfsQ.add(i);

        while (!bfsQ.isEmpty()) {
            int temp = bfsQ.poll();

            System.out.print(temp + " ");

            for (int j = 1; j < N + 1; j++) {
                if (graph[temp][j] == 1 && !visited[j]) {
                    bfsQ.add(j);
                    visited[j] = true;
                }
            }
        }
    }
}