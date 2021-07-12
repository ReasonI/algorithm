import java.util.Scanner;

public class Main_2577 {
    public static void main(String args[]) {

        Scanner sn = new Scanner(System.in);

        int multipleNum = sn.nextInt() * sn.nextInt() * sn.nextInt();
        int[] counter = new int[10];

        String multipleString = Integer.toString(multipleNum);

        for(int i =0; i < multipleString.length(); i++){
            counter[multipleNum%10]++;
            multipleNum/=10;
        }

        for(int i = 0; i < 10; i++){
            System.out.println(counter[i]);
        }
    }
}