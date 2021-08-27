import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Location {
    int x;
    int y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main_2178 {
    static int[][] graph;

    static boolean[][] visited;
    static int N, M;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());


        visited = new boolean[N][M];
        graph = new int[N][M];


        //그래프 만들기
        for (int i = 0; i < N; i++) {
            String st2 = br.readLine();
            for (int j = 0; j < M; j++) {
                graph[i][j] = st2.charAt(0) - '0';
            }
        }

        bfs();

    }

    private static void bfs() {
        Queue<Location> bfsQ = new LinkedList<>();
        int x = 0;
        int y = 0;
        int nextX = 0;
        int nextY = 0;
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        int[][] count = new int[N][M];

        visited[0][0] = true;
        count[0][0] = 1;

        bfsQ.add(new Location(0, 0));

        while (!bfsQ.isEmpty()) {
            Location location = bfsQ.poll();

            x = location.x;
            y = location.y;

            for (int i = 0; i < 4; i++) {
                nextX += dx[i];
                nextY += dy[i];
                if(!check(nextX, nextY)) continue;

                if (graph[nextX][nextY] == 0 || visited[nextX][nextY]) continue;

                bfsQ.add(new Location(nextX, nextY));
                visited[nextX][nextY] = true;
                count[nextX][nextY] = count[x][y] + 1;
            }

            System.out.print(count[N - 1][M - 1]);
        }
    }

    private static boolean check(int x, int y) {
        if (x < 0 || y < 0 || x > M - 1 || y > N - 1) {
            return false;
        }
        return true;
    }
}