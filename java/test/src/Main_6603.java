import java.io.IOException;
import java.util.Scanner;

public class Main_6603 {

    static int num;
    static int[] graph;
    static boolean[] visit;

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        while (true) {

            num = sc.nextInt();

            if(num == 0) return;

            graph = new int[num];
            visit = new boolean[num];

            for (int i = 0; i < num; i++) {
                graph[i] = sc.nextInt();
            }

            dfs(0,0);
            System.out.println("");

        }

    }

    public static void dfs(int idx, int count) {

        if (count == 6) {

            for(int i = 0; i < num; i++){
                if(!visit[i]) continue;
                System.out.print(graph[i] + " ");
            }
            System.out.println("");
        }

        for (int i = idx; i < num; i++) {
            visit[i] = true;
            dfs(i + 1, count + 1);
            visit[i] = false;
        }


    }

}