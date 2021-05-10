import java.io.*;
import java.util.StringTokenizer;

public class Main_14489 { //치킨 두 마리
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int chicken = Integer.parseInt((br.readLine()));

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if(a+b<chicken*2){
            bw.write(a+b+"");
        }else{
            bw.write((a+b)-chicken*2+"");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}