import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_2164 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Queue<Integer> cardPack = new LinkedList<Integer>();

        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            cardPack.add(i);
        }

        while(num-- > 1){
            cardPack.poll();

            int front = cardPack.poll();
            cardPack.add(front);
        }

        System.out.print(cardPack.peek());

    }


}