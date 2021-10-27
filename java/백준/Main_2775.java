import java.util.Scanner;

public class Main_2775 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        for (int i = 0; i < tc; i++) {
            int level = sc.nextInt();
            int num = sc.nextInt();
            System.out.println(countPeople(level, num));
        }

    }

    public static int countPeople(int level, int num) {

        if(level == 0) return num;
        if(num == 1) return 1;

        return countPeople(level, num - 1) + countPeople(level - 1, num);
    }

}