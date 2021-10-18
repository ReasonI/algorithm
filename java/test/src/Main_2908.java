import java.io.*;
import java.util.StringTokenizer;

public class Main_2908 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();

        br.close();

        for (int i = 2; i > -1; i--) {
            if (A.charAt(i) > B.charAt(i)) {

                for(int j = 2; j > -1; j--){
                    System.out.print(A.charAt(j));
                }

                return;
            } else if(B.charAt(i) > A.charAt(i)){
                for(int j = 2; j > -1; j--){
                    System.out.print(B.charAt(j));
                }
                return;
            }
        }

    }
}
