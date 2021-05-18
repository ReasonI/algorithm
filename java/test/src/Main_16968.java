import java.io.*;
import java.util.*;

public class Main_16968 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] number = br.readLine().toCharArray();

        int answer = 1;

        char temp = '0';
        for(char i : number){
            int c = 26;
            int d = 10;
            if(temp == 'c'){
                c = 25;
            }else if(temp == 'd'){
                d = 9;
            }
            if(i == 'c'){
                answer *= c;
            }else{
                answer *= d;
            }
            temp = i;
        }

        System.out.print(answer);

        br.close();
    }
}