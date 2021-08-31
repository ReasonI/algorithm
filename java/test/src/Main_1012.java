import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main_1012 {

    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static boolean[][] visit;
    static int[][] graph;
    static int M, N, K;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int caseNum = Integer.parseInt(br.readLine());
        int count;

        for (int cn = 0; cn < caseNum; cn++) {

            count = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());

            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            graph = new int[M][N];
            visit = new boolean[M][N];

            //그래프

            for (int i = 0; i < K; i++) {
                StringTokenizer st2 = new StringTokenizer(br.readLine());
                graph[Integer.parseInt(st2.nextToken())][Integer.parseInt(st2.nextToken())] = 1;
            }

            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if (check(i, j)) {
                        dfs(i, j);
                        count++;
                    }
                }
            }

            System.out.println(count);

        }


    }

    public static void dfs(int x, int y) {

        int nextX, nextY = 0;

        visit[x][y] = true;

        for (int i = 0; i < 4; i++) {
            nextX = x + dx[i];
            nextY = y + dy[i];

            if (!check(nextX, nextY)) continue;

            dfs(nextX, nextY);
        }

    }

    public static boolean check(int x, int y) {
        if (x < 0 || y < 0 || x >= M || y >= N) return false;

        if (visit[x][y] || graph[x][y] == 0) return false;

        return true;
    }

}