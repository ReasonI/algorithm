import java.io.*;

public class Main_2010 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tabNum = Integer.parseInt((br.readLine()));
        int plug = 0;

        for(int i = 0; tabNum > i; i++ ){
            plug = plug + Integer.parseInt(br.readLine());
        }

        bw.write(plug-(tabNum-1)+"");

        bw.flush();
        br.close();
        bw.close();
    }
}

