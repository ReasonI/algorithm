import java.util.Scanner;

public class Main_3460 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String binary = "";

        for (int i = 0; i < n; i++) {

            int num = sc.nextInt();

            while(num > 0){
                 binary = binary + (num % 2);
                 num = num / 2;
            }

            for(int j = 0; j < binary.length(); j++){
                if(binary.charAt(j) == '1') System.out.print(j + " ");
            }

            binary = "";

            System.out.println("");

            }

        }

}