import java.io.*;
import java.util.StringTokenizer;

public class Main_9093 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int tc = Integer.parseInt(st.nextToken());

        for(int i = 0; i < tc; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            while(st2.hasMoreTokens()){
                String word = st2.nextToken();
                for(int j = word.length() - 1; j >= 0; j--){
                    bw.write(word.charAt(j));
                }
                bw.write(" ");
            }

            bw.write("\n");

        }
        bw.flush();

        br.close();
        bw.close();

    }

}
