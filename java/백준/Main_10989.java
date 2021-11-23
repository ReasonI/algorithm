import java.io.*;
import java.util.Arrays;

public class Main_10989 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int[] numArray = new int[num];

        for(int i = 0;i < num;i++){
            numArray[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(numArray);

        for(int temp : numArray){
            bw.write(temp+"\n");
        }
        bw.flush();

        br.close();
        bw.close();

    }

}