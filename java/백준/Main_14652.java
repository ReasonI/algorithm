import java.io.*;
import java.util.*;

public class Main_14652 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int seat = Integer.parseInt(st.nextToken());
        bw.write(seat/m + " " + seat%m);

        bw.flush();
        br.close();
        bw.close();
    }
}

