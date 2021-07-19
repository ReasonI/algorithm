import java.util.Scanner;

public class Main_1546 {
    public static void main(String args[]) {

        Scanner sn = new Scanner(System.in);

        int num = sn.nextInt();
        float answer = 0;
        float[] number = new float[num];

        number[0] = sn.nextInt();
        float max = number[0];

        for(int i = 1; i < num; i++){
            number[i] = sn.nextInt();

            if(max < number[i]){
                max = number[i];
            }
        }

        for(int i = 0;i < num; i++){
                answer += (number[i] / max) * 100;
        }

            System.out.print(answer / num);
    }
}