import java.io.*;
import java.util.*;

public class Main_2312 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int caseNum = Integer.parseInt(br.readLine());
        List<String> answer = new ArrayList<>();

        for(int i = 0; i < caseNum ; i++){

            int num = Integer.parseInt(br.readLine());
            int x = 2;
            int count = 0;

            while(true){
                if(num % x == 0){
                    if(num/x == num){
                        break;
                    }
                    num = num / x;
                    count++;
                }else if(x > num){
                    break;
                }else{
                    x++;
                    count = 0;
                }
                if(count !=0 && num % x != 0)
                answer.add(x + " " + count);

            }
        }
        for(String i : answer){
            System.out.println(i);
        }
        br.close();
    }
}