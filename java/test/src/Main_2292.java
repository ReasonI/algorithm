import java.io.*;

public class Main_2292 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        br.close();

        int M = 1;

        if(N == 1){
            System.out.print(1);
            return;
        }

        int count = 0;

        while( M < N){
            M += 6  * count;
            count++;
        }

        System.out.print(count );


    }

}