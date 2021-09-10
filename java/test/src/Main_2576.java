import java.util.Scanner;

public class Main_2576 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int sum = 0;
        boolean check = false;


        for (int i = 0; i < 7; i++) {
            int num = sc.nextInt();

            if(num%2 == 1){
                check = true;
                sum += num;
                if (min > num) min = num;

            }

        }

        if(check){
            System.out.println(sum);
            System.out.println(min);
        } else{
            System.out.println(-1);
        }

    }
}