import java.io.*;
import java.util.StringTokenizer;

public class Main_2581 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int start = Integer.parseInt(br.readLine());
        int end = Integer.parseInt(br.readLine());

        int min = 10001;
        int sum = 0;
        boolean check;


        for (int i = start; i <= end; i++) {
            check = true;
            if (i == 1) continue;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) check = false;
            }

            if (check) {
                sum += i;
                if (min > i) min = i;
            }
        }

        if (sum == 0) {
            System.out.println(-1);
            return;
        }
        System.out.println(sum);
        System.out.println(min);

        br.close();

    }

}
