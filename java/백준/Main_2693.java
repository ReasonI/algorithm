import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_2693 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());
        int[] array = new int[10];
        int N = 3;

        for (int i = 0; i < tc; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int j = 0; j < 10; j++){
                array[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(array);

            System.out.println(array[10-N]);
        }

        br.close();

    }

}
