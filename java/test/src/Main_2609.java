import java.util.Scanner;

public class Main_2609 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int min = 1;
        int max = 1;

        int num = 2;

        while (true) {
            if (A % num == 0 && B % num == 0) {
                A /= num;
                B /= num;

                min *= num;

                num = 2;
            } else {
                if (num >= A || num >= B) {

                    max = min * A * B;
                    break;
                }
                num++;
                continue;
            }
        }

        System.out.println(min);
        System.out.println(max);
    }

}