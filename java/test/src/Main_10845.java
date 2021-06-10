import java.io.*;
import java.util.LinkedList;

public class Main_10845 {
    public static void main(String args[]) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());
        LinkedList<Integer> queue = new LinkedList<>();

        for(int i = 0; i <number; i++) {
            String[] s = br.readLine().split(" ");

            switch(s[0]) {
                case "push":
                    int x = Integer.parseInt(s[1]);
                    queue.add(x);
                    break;
                case "pop":
                    if (queue.isEmpty())
                        System.out.println(-1);
                    else
                        System.out.println(queue.removeFirst());
                    break;
                case "empty":
                    if (queue.isEmpty())
                        System.out.println(1);
                    else
                        System.out.println(0);
                    break;
                case "front":
                    if (queue.isEmpty())
                        System.out.println(-1);
                    else
                        System.out.println(queue.getFirst());
                    break;
                case "back":
                    if (queue.isEmpty())
                        System.out.println(-1);
                    else
                        System.out.println(queue.getLast());
                    break;
                case "size":
                    System.out.println(queue.size());
                    break;
            }
        }
    }
}