import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1966 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());

        int[] numArray;
        int count;

        for (int i = 0; i < tc; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            int num = Integer.parseInt(st.nextToken());
            int target = Integer.parseInt(st.nextToken());
            count = 1;

            LinkedList<Integer[]> queue = new LinkedList<>();

            numArray = new int[num];

            for(int x = 0; x < num; x++){
                queue.add(new Integer[] {x, Integer.parseInt(st2.nextToken())});
            }

            for(int j = 0; j < num; j++){

            }

            bw.write(count + "\n");

        }


        bw.flush();

        br.close();
        bw.close();

    }

}
