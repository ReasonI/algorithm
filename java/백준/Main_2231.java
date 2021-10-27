import java.io.*;

public class Main_2231 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = 0;
        boolean check = false;

        for(int i = 1; i < 1000001; i++){
            int temp = i;
            M = i;

            while(temp != 0){
                M += temp % 10;
                temp /= 10;
            }

            if(N == M){
                System.out.print(i);
                check = true;
                break;
            }
        }

        if(!check) System.out.print(0);

        br.close();

    }

}