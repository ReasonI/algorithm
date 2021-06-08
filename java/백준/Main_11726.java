import java.io.*;

public class Main_11726 {

    static int[] dp;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        dp = new int[n + 1];
        dp[0] = dp[1] = 1;

        recur(n);

        System.out.print(recur(n));

    }

    static int recur(int n) {

        if(dp[n] > 0){
            return dp[n];
        }

        dp[n] = (recur(n-2) + recur(n-1)) % 10007;

        return dp[n];
        }
}