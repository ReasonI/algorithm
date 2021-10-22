import java.io.*;
import java.util.StringTokenizer;

public class Main_10250 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());

        for(int i = 0; i < tc; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());

            if(num % h == 0) System.out.println(h * 100 + num / h);
            else System.out.println(num % h * 100 + num / h + 1);
        }

        br.close();

    }

}
