import java.util.Scanner;

public class Main_1259 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String num = "";
        boolean check;

        while (true) {
            num = sc.next();
            check = true;

            if (num.equals("0")) return;

            for (int i = 0; i < num.length() / 2; i++) {

                if (num.charAt(i) == num.charAt(num.length() - 1 - i)) continue;

                System.out.println("no");
                check = false;
                break;
            }

            if (check) System.out.println("yes");
        }

    }

}