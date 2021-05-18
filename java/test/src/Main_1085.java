import java.io.*;
import java.util.*;

public class Main_1085 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int answerX = 0;
        int answerY = 0;

        if(w>x){
            answerX = Math.min(x,w-x);
        }else{
            answerX = Math.min(x,x-w);
        }
        if(h>y){
            answerY = Math.min(y,h-y);
        }else{
            answerY = Math.min(y, y-h);
        }

        System.out.print(Math.min(answerX,answerY));

        br.close();
    }
}