import java.io.*;
import java.util.*;

public class Main_5347 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        int[] answer = new int [count];

        for(int i = 0; i < count ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            int common = 1;
            int x = 2;
            while(true){
                if(num1 % x == 0 && num2 % x == 0){
                    common *= x;

                    num1 = num1 / x;
                    num2 = num2 / x;

                    x = 2;
                }else if(x > num1 || x > num2){
                    break;
                }else{
                    x++;
                }
            }

            answer[i] = common*num1*num2;
        }
        for(int i = 0; i < count; i++){
            System.out.println(answer[i]);
        }
        br.close();
    }
}