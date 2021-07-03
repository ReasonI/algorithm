import java.io.*;
import java.util.StringTokenizer;

public class Main_10818 {
    public static void main(String args[]) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int arrayN = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        int max = -1000001;
        int min = 1000001;

        for(int i = 0; i < N ; i++){
            arrayN = Integer.parseInt(st.nextToken());
            max = Math.max(max, arrayN);
            min = Math.min(min, arrayN);

        }
        System.out.print(min + " "+ max);
    }
}