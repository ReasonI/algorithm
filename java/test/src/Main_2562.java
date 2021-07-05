import java.io.*;

public class Main_2562 {
    public static void main(String args[]) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int maxNum = 0;
        int counter = 0;
        int temp = 0;
        for(int i = 0; i < 9; i++){
            temp = Integer.parseInt(br.readLine());
            if(maxNum < temp){
                maxNum = temp;
                counter = i+1;
            }
        }

        bw.write(maxNum +"\n"+counter);

        bw.flush();
        br.close();
        bw.close();
    }
}