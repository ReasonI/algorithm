import java.io.*;
import java.util.StringTokenizer;

public class Main_2460 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int count = 0;

        for(int i = 0; i < 10; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int out = Integer.parseInt(st.nextToken());
            int in = Integer.parseInt(st.nextToken());

            if (i == 0){
                count = in;
                max = in;
                continue;
            }

            count -= out;
            count += in;

            if(count > max) max = count;
        }

        System.out.print(max);

        br.close();

    }

}
