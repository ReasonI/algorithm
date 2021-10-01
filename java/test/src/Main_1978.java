import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1978 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());
        int count = 0;
        boolean check;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < tc; i++) {

            int num = Integer.parseInt(st.nextToken());
            if(num == 1) continue;

            check = true;

            for(int j = 2; j < num; j++){
                if(num % j == 0) check = false;
            }

            if(check) count++;

        }

        System.out.print(count);
        br.close();

    }

}
