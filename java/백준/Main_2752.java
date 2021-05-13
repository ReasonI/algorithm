import java.io.*;
import java.util.*;

public class Main_2752 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] numberArray = new int[3];
        for(int i = 0; i < 3; i++){
            numberArray[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(numberArray);

        for (int i : numberArray){
            System.out.print(i + " ");
        }

        br.close();
    }
}