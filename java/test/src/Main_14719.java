import java.io.*;
import java.util.StringTokenizer;

public class Main_14719 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int rainSum = 0;

        int[] map = new int[W];

        for (int i = 0; i < W; i++) {
            map[i] = Integer.parseInt(st2.nextToken());
        }

        int leftMax;
        int rightMax;
        int idx = 0;

        for (int i = 1; i < W - 1; i++) {

            leftMax = 0;
            rightMax = 0;

            for(int j = idx; j < i; j++){
                if( leftMax < map[j]){
                    leftMax = map[j];
                    idx = j;
                }
            }

            for(int j = i + 1; j < W; j++){
                rightMax = Math.max(map[j], rightMax);
            }

            if(map[i] < leftMax && map[i] < rightMax){
                rainSum += Math.min(leftMax, rightMax) - map[i];
            }

        }

        System.out.print(rainSum);

        br.close();

    }

}
