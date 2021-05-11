import java.io.*;
import java.util.Arrays;

public class Main_10610 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String stringNumber = br.readLine();

        //먼저 배열에 정렬해서 넣고, 0있는지 확인, 각 수 합이 3의 배수인지 확인 아니면 -1, 맞으면 string으로 출력

        char[] arrayNumber = stringNumber.toCharArray();
        int total = 0;
        for(int i : arrayNumber){
            total += i;
        }
        if(!stringNumber.contains("0") || !(total%3 == 0)){
            bw.write(-1+"");
        }else{
            Arrays.sort(arrayNumber);

            bw.write(new StringBuilder(new String(arrayNumber)).reverse().toString());
        }

        bw.flush();
        br.close();
        bw.close();
    }
}