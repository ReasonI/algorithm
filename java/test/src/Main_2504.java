import java.io.*;
import java.util.Stack;

public class Main_2504 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine().toUpperCase();

        Stack<String> stack = new Stack<>();

        stack.add(word.substring(0,1));

        for (int i = 1; i < word.length(); i++) {

            String bracket = word.substring(i,i+1);

            if (bracket == "(" || bracket == "[") {
                stack.add(bracket);
                continue;
            }

            String temp = stack.pop();

            if(temp == "(" && bracket == ")") stack.add("2");
            else if(temp == "[" && bracket == "]") stack.add("3");
            else if(temp != "(" || temp != "["){
                stack.pop();
                if( bracket == ")") stack.add(String.valueOf(Integer.parseInt(temp) * 2));
                else stack.add(String.valueOf(Integer.parseInt(temp) * 3));
            }else{

            }


        }

        br.close();

    }

}
