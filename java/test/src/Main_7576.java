import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_7576 {

    static int N, M;
    static int[][] graph;
    static boolean[][] visit;

    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    static int[][] count;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        graph = new int[M][N];
        visit = new boolean[M][N];
        count = new int[M][N];

        //그래프 만들기
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                graph[i][j] = sc.nextInt();
            }
        }

        bfs();

        int max = 0;

        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                if(graph[i][j] == 0){
                    System.out.println(-1);
                    return;
                }
                max = Math.max(max, count[i][j]);
            }
        }

        System.out.print(max);

    }

    public static void bfs() {

        int nextX, nextY = 0;
        int[] location;

        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (graph[i][j] == 1) queue.add(new int[]{i, j});

            }
        }

        while (!queue.isEmpty()) {

            location = queue.poll();

            for (int i = 0; i < 4; i++) {
                nextX = location[0] + dx[i];
                nextY = location[1] + dy[i];

                if (!check(nextX, nextY)) continue; // -1 또는 들린적 있다.

                graph[nextX][nextY] = 1;
                visit[nextX][nextY] = true;
                queue.add(new int[]{nextX, nextY});
                count[nextX][nextY] = count[location[0]][location[1]] + 1;
            }

        }

    }

    public static boolean check(int x, int y) {
        if (x < 0 || y < 0 || x > M - 1 || y > N - 1) return false;

        if (visit[x][y] || graph[x][y] != 0) return false; // -1, 0 고려해서 고칠 것

        return true;
    }

}