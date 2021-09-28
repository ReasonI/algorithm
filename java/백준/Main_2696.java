import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main_2696 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());

        for (int i = 0; i < tc; i++) {
            PriorityQueue<Integer> ascPq = new PriorityQueue<>();
            PriorityQueue<Integer> descPq = new PriorityQueue<>(Collections.reverseOrder());

            int size = Integer.parseInt(br.readLine());
            int count = 0;

            System.out.println(size / 2 + size % 2);

            StringTokenizer st = null;

            for (int j = 0; j < size; j++) {
                if (j % 10 == 0) st = new StringTokenizer(br.readLine());

                int num = Integer.parseInt(st.nextToken());

                if (ascPq.size() == descPq.size()) descPq.add(num);
                else ascPq.add(num);

                if (!ascPq.isEmpty()) {

                    if (descPq.peek() > ascPq.peek()) {
                        int temp = ascPq.poll();
                        ascPq.add(descPq.poll());
                        descPq.add(temp);

                    }
                }

                if (j % 2 == 0) {
                    System.out.print(descPq.peek() + " ");
                    count++;
                    if (count % 10 == 0) System.out.println("");
                }

            }
            System.out.println("");
        }

        br.close();

    }

}
