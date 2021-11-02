import java.util.Scanner;

public class Main_2839 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int sugar = sc.nextInt();

        int count = 0;

        while(true){
            if(sugar % 5 == 0){
                System.out.print(count += sugar / 5);
                break;
            }else{
                sugar -= 3;
                count++;
            }

            if(sugar < 0){
                System.out.print(-1);
                break;
            }
        }

    }

}