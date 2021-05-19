import java.io.*;
import java.util.StringTokenizer;

public class Main_2884 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        if(minute < 45){
            if(hour == 0){
                hour = 23;
                minute = 60 - (45-minute);
            }else{
                hour--;
                minute = 60 - (45-minute);
            }
        }else{
            minute -= 45;
        }
        bw.write(hour+" "+minute);

        bw.flush();
        br.close();
        bw.close();
    }
}