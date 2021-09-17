import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1158 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<Integer>();

        for (int i = 1; i < N + 1; i++) {

            queue.add(i);

        }
        System.out.print("<");

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < K - 1; j++) {
                queue.add(queue.poll());
            }

            System.out.print(queue.poll());
            if(i != N - 1){
                System.out.print(", ");
            }
        }
        System.out.print(">");

    }

}
