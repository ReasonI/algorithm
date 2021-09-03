import java.io.IOException;
import java.util.Scanner;

public class Main_11720 {
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String s = sc.next();
        int sum = 0;

        for(int i = 0; i < num; i++){
            sum += s.charAt(i) - '0';
        }

        System.out.print(sum);

    }
}