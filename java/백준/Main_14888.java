import java.io.*;
import java.util.StringTokenizer;

public class Main_14888 {
    static int N;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    static int[] number;
    static int[] operator;

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        number = new int[N];
        operator = new int[4];

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            number[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < 4; i++) {
            operator[i] = Integer.parseInt(st2.nextToken());
        }

        dfs(number[0], 1);

        System.out.println(max);
        System.out.println(min);

        br.close();

    }

    public static void dfs(int num, int idx) {

        if (idx == N) {
            max = Math.max(max, num);
            min = Math.min(min, num);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operator[i] > 0) {
                operator[i]--;

                switch (i) {
                    case 0:
                        dfs(num + number[idx], idx + 1);
                        break;
                    case 1:
                        dfs(num - number[idx], idx + 1);
                        break;
                    case 2:
                        dfs(num * number[idx], idx + 1);
                        break;
                    case 3:
                        dfs(num / number[idx], idx + 1);
                        break;
                }

                operator[i]++;
            }
        }

    }

}
