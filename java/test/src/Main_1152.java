import java.io.*;
import java.util.StringTokenizer;

public class Main_1152 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;
        String temp = "";

        while(st.hasMoreTokens()){
            temp = st.nextToken();
            count++;
        }

        System.out.println(count);

        br.close();

    }

}
