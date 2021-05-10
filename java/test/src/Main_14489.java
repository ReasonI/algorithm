import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_14489 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt((br.readLine()));
        int[] dice = new int[7];


        for(int i = 0; num > i ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int j = 0; 4 > j; j++){
                dice[Integer.parseInt(st.nextToken())]++;
            }

            if (Arrays.stream(dice).max().getAsInt() == 1) {
                bw.write(Arrays.asList(dice).lastIndexOf(1)+"");
                bw.write(Arrays.asList(dice).lastIndexOf(1)*100+"");
            } else {
                bw.write("b");
            }

        }


        bw.flush();
        br.close();
        bw.close();
    }
}

