import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class Main_17608 {
    public static void main(String[] args)throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int standardNum;
        int answer = 1;
        Stack<Integer> numStack = new Stack <>();

        for(int i = 0; i < num; i++){
            numStack.push(Integer.parseInt(br.readLine()));
        }

        standardNum = numStack.pop();

        while(!numStack.isEmpty()){
            int nextNum = numStack.pop();

            if(nextNum > standardNum){
                standardNum = nextNum;
                answer++;
            }

        }

        System.out.print(answer);
        br.close();
    }
}