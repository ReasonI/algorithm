import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_4153 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int[] edge = new int[3];

            for(int i = 0; i < 3; i++){
                edge[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(edge);

            if (edge[0] == 0) break;

            if (edge[0] * edge[0] + edge[1] * edge[1] == edge[2] * edge[2]) System.out.println("right");
            else System.out.println("wrong");

        }

        br.close();

    }

}
