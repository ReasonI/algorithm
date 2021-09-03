import java.util.Scanner;

public class Main_8958 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int tcNum = sc.nextInt();

        for(int i = 0; i < tcNum; i++){
            int count = 0;
            int sum = 0;
            String answer = sc.next();

            for(int j = 0; j < answer.length(); j++){
                if(answer.charAt(j) == 'O'){
                    count++;
                    sum += count;
                }else{
                    count = 0;
                }
            }

            System.out.println(sum);
        }
        
    }
}