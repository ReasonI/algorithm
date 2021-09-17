import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_9012 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int tc = Integer.parseInt(st.nextToken());
        boolean check;

        for (int i = 0; i < tc; i++) {

            check = false;
            String word = br.readLine();

            Stack<String> stack = new Stack<String>();
            for (int j = 0; j < word.length(); j++) {

                if(word.charAt(j) == '('){
                    stack.add("(");
                }else{
                    if(stack.isEmpty()){
                        bw.write("NO");
                        bw.write("\n");
                        check = true;
                        break;
                    }
                    stack.pop();
                }
            }
            if(check) continue;
            else if(stack.isEmpty()) bw.write("YES");
            else bw.write("NO");

            bw.write("\n");
        }


        bw.flush();

        br.close();
        bw.close();

    }

}
