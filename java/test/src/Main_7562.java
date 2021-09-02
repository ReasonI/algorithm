import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_7562 {

    static int N;
    static int presentX, presentY, goalX, goalY;

    static int[][] count;
    static boolean[][] visit;

    static int[] dx = {-2,-2,-1,-1,1,1,2,2};
    static int[] dy = {1,-1,2,-2,2,-2,1,-1};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int caseNum = sc.nextInt();

        for(int cn = 0; cn < caseNum; cn++){

            N = sc.nextInt();
            count = new int[N][N];
            visit = new boolean[N][N];

            presentX = sc.nextInt();
            presentY = sc.nextInt();

            goalX = sc.nextInt();
            goalY = sc.nextInt();

            bfs();

            System.out.println(count[goalX][goalY]);

        }
    }

    public static void bfs() {

        int nextX, nextY;

        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[]{presentX,presentY});
        visit[presentX][presentY] = true;

        while(!queue.isEmpty()){
            int[] location = queue.poll();

            for(int i = 0; i < 8; i++){
                nextX = location[0] + dx[i];
                nextY = location[1] + dy[i];

                if(!check(nextX, nextY)) continue;

                queue.add(new int[]{nextX,nextY});
                count[nextX][nextY] = count[location[0]][location[1]] + 1;
                visit[nextX][nextY] = true;

                if(nextX == goalX && nextY == goalY) return;
                
            }
        }

    }

    public static boolean check(int x, int y){
        if(x < 0 || y < 0|| x > N - 1|| y > N - 1) return false;

        if(visit[x][y]) return false;

        return true;
    }

}