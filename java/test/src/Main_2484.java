import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main_2484 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt((br.readLine()));
        int[] reward = new int[num];

        for(int i = 0; num > i ; i++){
            int[] dice = new int[7];
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int j = 0; 4 > j; j++){
                dice[Integer.parseInt(st.nextToken())]++;
            }
            ArrayList<Integer> integerDice = new ArrayList<>(Arrays.asList(Arrays.stream(dice).boxed().toArray(Integer[]::new)));
            if (Arrays.stream(dice).max().getAsInt() == 1) {
                reward[i] = integerDice.lastIndexOf(1)*100;
            } else if (Arrays.stream(dice).max().getAsInt() == 2){
                if(integerDice.indexOf(2) == integerDice.lastIndexOf(2)){
                    reward[i] =1000+integerDice.indexOf(2)*100;
                }else{
                    reward[i] =2000+integerDice.indexOf(2)*500 + integerDice.lastIndexOf(2)*500;
                }

            } else if (Arrays.stream(dice).max().getAsInt() == 3){
                reward[i] =10000+integerDice.indexOf(3)*1000;
            }else{
                reward[i] = 50000+integerDice.indexOf(4)*5000;
            }
        }

        bw.write(Arrays.stream(reward).max().getAsInt()+"");

        bw.flush();
        br.close();
        bw.close();
    }
}

