import java.io.*;
import java.util.StringTokenizer;

public class Main_2193 {

    static long[] memory;

    public static void main(String[] args) throws Exception {

        //입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        memory = new long[N+1];

        dp(N);

        System.out.print(memory[N]);
    }

    static long dp(int N) {
        if(memory[N] !=0 ){
            return memory[N];
        }
        if (N == 1){
            return memory[1] = 1;
        }else if(N == 2){
            return memory[2] = 1;
        }else{
                memory[N] = dp(N-1) + dp(N-2);
        }
        return memory[N];
    }
}