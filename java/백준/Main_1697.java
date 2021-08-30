import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_1697 {

    static int[] count = new int[100001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int subin = sc.nextInt();
        int sis = sc.nextInt();

        bfs(subin, sis);

        System.out.println(count[sis]);

    }

    public static void bfs(int subin, int sis) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(subin);

        while (!queue.isEmpty()) {

            subin = queue.poll();
            if(subin == sis){
                break;
            }

            if(subin - 1 >= 0 && count[subin - 1] == 0){
                queue.add(subin - 1);
                count[subin - 1] = count[subin] + 1;
            }

            if(subin + 1 <= 100000 && count[subin + 1] == 0){
                queue.add(subin + 1);
                count[subin + 1] = count[subin] + 1;
            }

            if(subin * 2 <= 100000 && count[subin * 2] == 0){
                queue.add(subin * 2);
                count[subin * 2] = count[subin] + 1;
            }


        }
    }
}