import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main_1966 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());

        int count;
        boolean isMax;

        for (int i = 0; i < tc; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            int num = Integer.parseInt(st.nextToken());
            int target = Integer.parseInt(st.nextToken());
            count = 0;

            LinkedList<int[]> queue = new LinkedList<>();

            for(int j = 0; j < num; j++){
                queue.add(new int[] {j, Integer.parseInt(st2.nextToken())});
            }

            while(!queue.isEmpty()){

                int[] first = queue.poll();
                isMax = true;

                for(int j = 0; j < queue.size(); j++){
                    if(first[1] < queue.get(j)[1]){

                        queue.offer(first);

                        for(int x = 0; x < j; x++){
                            queue.offer(queue.poll());
                        }

                        isMax = false;
                        break;
                    }
                }

                if(!isMax) continue;

                count++;
                if(first[0] == target) break;

            }

            bw.write(count + "\n");

        }


        bw.flush();

        br.close();
        bw.close();

    }

}
