import java.util.Scanner;

public class Main_5598 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String num = sc.next();

        for(int i = 0; i < num.length(); i++){
            int alphNum = num.charAt(i) - 0;

            if(alphNum < 68) {
                System.out.print((char) (alphNum + 23));
            }else{
                System.out.print((char) (alphNum - 3));
            }
        }

    }
}