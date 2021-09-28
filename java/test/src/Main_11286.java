import java.io.*;
import java.util.PriorityQueue;

public class Main_11286 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) ->{
            int abs1 = Math.abs(a);
            int abs2 = Math.abs(b);

            if(abs1 == abs2) return a > b ? 1 : -1;

            return abs1 - abs2;

        });

        for (int i = 0; i < tc; i++) {

            int num = Integer.parseInt(br.readLine());

            if(num == 0){
                if(pq.isEmpty()) System.out.println(0);
                else{
                    System.out.println(pq.poll());
                }
            }else{
                pq.add(num);
            }


        }

        br.close();

    }

}
