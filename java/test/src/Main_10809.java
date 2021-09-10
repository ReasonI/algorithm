import java.util.Scanner;

public class Main_10809 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        boolean check = false;

        for (int i = 0; i < 26; i++) {

            for(int j = 0; j < word.length(); j++){
                if( i + 49 == word.charAt(j) - '0' && !check){
                    System.out.print(j + " ");
                    check = true;
                }
            }
            if(!check) System.out.print(-1 + " ");
            check = false;

        }

    }
}