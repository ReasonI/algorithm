import java.io.*;
import java.util.StringTokenizer;

public class Main_1292 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        int sum = 0;
        int count = 0;
        boolean check = true;

        int i = 1;

        while (check) {

            for(int j = 0; j < i; j++){
                count++;
                if(count >= start && count <= end) sum+= i;
                if(count == end) check = false;
            }

            i++;

        }

        System.out.print(sum);
        br.close();

    }

}
