import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_15829 {


    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String alpha = br.readLine();

        long r = 1;
        long sum = 0;

        for(int i = 0; i < num; i++){
            sum += (alpha.charAt(i) - '0'- 48) * r;
            r = (r * 31) % 1234567891;
        }

        System.out.print(sum % 1234567891);

        br.close();

    }

}