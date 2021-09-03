import java.util.Scanner;

public class Main_2920 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String answer = "";

        for(int i = 0; i < 7; i++){
            int nextN = sc.nextInt();

            if(num == nextN - 1) answer = "ascending";
            else if(num == nextN + 1) answer = "descending";
            else{
                answer = "mixed";
                break;
            }

            num = nextN;
        }

        System.out.print(answer);

    }
}