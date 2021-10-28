import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2798 {

    static int cardNum;
    static int goalNum;

    static int[] num;
    static boolean[] visited;

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        cardNum = Integer.parseInt(st.nextToken());
        goalNum = Integer.parseInt(st.nextToken());

        num = new int[cardNum];
        visited = new boolean[cardNum];


        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < cardNum; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }


        System.out.print(nearNum(0, 0,0));
    }

    public static int nearNum(int sum, int count, int idx) {

        if (count == 3) {
            return sum > goalNum ? 0 : sum;
        }

        if (idx == cardNum) return 0;

        int max = 0;

        for(int i = idx; i < cardNum; i++){
            max = Math.max(max, nearNum(sum + num[i], count + 1, i + 1));
        }

        return max;

    }

}