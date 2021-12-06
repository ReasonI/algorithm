import java.util.Scanner;
import java.util.Stack;

public class Main_10773 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stack<Integer> pocket = new Stack<Integer>();

        int num = sc.nextInt();
        int sum = 0;

        while(num-- > 0){
            int money = sc.nextInt();

            if(money == 0){
                pocket.pop();
            }else{
                pocket.add(money);
            }
        }

        for(int money : pocket){
            sum += money;
        }

        System.out.print(sum);

    }


}