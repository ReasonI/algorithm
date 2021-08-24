import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1260 {
    static int[][] graph;

    static boolean[] visited;
    static int N, edgeNum, V;

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
//        for(int i = 1; i < N + 1; i++){
//            if(!visited[i]){
//                dfs(i);
//            }
//        }
        //bfs 실행

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

        System.out.print(i + " ");
    }
}