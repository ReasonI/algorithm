import java.util.Scanner;

public class Main_1546 {
    public static void main(String args[]) {

        Scanner sn = new Scanner(System.in);

        int num = sn.nextInt();
        int max = 0;
        int count = 0;
        float answer = 0;
        int[] number = new int[num];

        for(int i = 0; i < num; i++){
            number[i] = sn.nextInt();
        }

        for(int i = 0; i < num; i++){
            if (max < number[i]){
                max = number[i];
                count = i;
            }
        }

        for(int i = 0;i < num; i++){
            if(i == count){
                continue;
            }else{
                answer = answer + number[i] / max * 100;
            }
        }

            System.out.print(answer/num);
    }
}