import java.io.*;

public class Main_10870 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int sum = fibonacci(N);

        System.out.print(sum);
        br.close();
    }

    public static int fibonacci(int N){
        if (N == 0) return 0;
        else if(N == 1) return 1;

        return fibonacci(N-1)+fibonacci(N-2);
    }
}