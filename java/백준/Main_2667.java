import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;

public class Main_2667 {

    static boolean[][] visit;
    static int[][] graph;
    static int num;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        num = Integer.parseInt(br.readLine());
        graph = new int[num][num];
        visit = new boolean[num][num];

        LinkedList<Integer> list = new LinkedList<>();

        //그래프
        for (int i = 0; i < num; i++) {
            String temp = br.readLine();
            for (int j = 0; j < num; j++) {
                graph[i][j] = temp.charAt(j) - '0';
            }
        }

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {

                if(check(j, i)){
                    list.add(dfs(j, i));
                }
            }
        }

        System.out.println(list.size());
        Collections.sort(list);
        for(Integer num : list){
            System.out.println(num);
        }


    }

    public static int dfs(int x, int y) {

        int count = 1;
        visit[x][y] = true;

        int nextX = 0;
        int nextY = 0;


        for (int i = 0; i < 4; i++) {
            nextX = x + dx[i];
            nextY = y + dy[i];

            if (!check(nextX, nextY)) continue;

            count += dfs(nextX, nextY);

        }

        return count;
    }

    public static boolean check(int x, int y) {
        if (x < 0 || x > num - 1 || y < 0 || y > num - 1) return false;

        if (visit[x][y] || graph[x][y] == 0) return false;

        return true;
    }

}