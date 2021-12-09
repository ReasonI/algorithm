import java.util.LinkedList;
import java.util.Scanner;

public class Main_11866 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int K = sc.nextInt();

        int target = K - 1;
        int count = num;

        LinkedList<Integer> numList = new LinkedList<>();

        for (int i = 1; i <= num; i++) {
            numList.add(i);
        }

        System.out.print("<");

        while (true) {

            count--;

            if (count == 0) {
                System.out.print(numList.remove(target) + ">");
                break;
            }

            System.out.print(numList.remove(target) + ", ");

            target = (target + K - 1) % count;
        }
    }


}