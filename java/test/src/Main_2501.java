import java.io.*;
import java.util.StringTokenizer;

public class Main_2501 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int count = 0;

        for(int i = 1; i < N+1; i++){

            if(N % i == 0){
                count ++;
            }
            if(count == K){
                System.out.print(i);
                break;
            }
        }

        if(count < K) System.out.print(0);

        br.close();

    }

}
