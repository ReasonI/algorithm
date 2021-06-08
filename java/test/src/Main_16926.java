import java.io.*;
import java.util.StringTokenizer;

public class Main_16926 {

    static int N, M, turnTime;
    static int[][] turningArray;
    static int[] directionN = {0,1,0,-1};
    static int[] directionM = {1,0,-1,0};

    public static void main(String[] args) throws Exception {

        //입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        turnTime = Integer.parseInt(st.nextToken());

        turningArray = new int[N][M];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++){
                turningArray[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //구현
        int squareNum = Math.min(N,M) / 2;

        for(int i = 0; i < turnTime; i++){ //돌려돌려~
            rotate(squareNum);
        }

        //출력
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                System.out.print(turningArray[i][j] + " ");
            }
            System.out.println();
        }

    }

    static void rotate(int level) {
        for(int group = 0; group < level; group++) {
            int direction = 0 ;
            int standardN = group;
            int standardM = group;
            int temp = turningArray[standardN][standardM];

            while (direction < 4) {
                int nextN = standardN + directionN[direction];
                int nextM = standardM + directionM[direction];

                if(nextN >= group && nextM >= group && nextN < N - group && nextM < M - group ) {
                    turningArray[standardN][standardM] = turningArray[nextN][nextM];
                    standardN = nextN;
                    standardM = nextM;
                }else {
                    direction++;
                }
            }
            turningArray[group + 1][group] = temp;
        }
    }
}