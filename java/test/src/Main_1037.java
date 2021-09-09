import java.util.Scanner;

public class Main_1037 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int min = 1000001;
        int max = 1;


        for (int i = 1; i < num + 1; i++) {
            int temp = sc.nextInt();
            if (min > temp) min = temp;

            if (max < temp) max = temp;
        }
        System.out.print(min*max);
    }
}