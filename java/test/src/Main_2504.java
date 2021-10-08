import java.io.*;
import java.util.Stack;

public class Main_2504 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine().toUpperCase();

        Stack<String> stack = new Stack<>();
        Integer num = 0;

        for (int i = 0; i < word.length(); i++) {

            String bracket = word.substring(i, i + 1);

            if (bracket.equals("(") || bracket.equals("[")) {
                stack.add(bracket);
                continue;
            }

            if (stack.isEmpty()) {
                System.out.print(0);
                return;
            }
            String temp = stack.pop();

            if (temp.equals("(") && bracket.equals(")")) stack.add("2");
            else if (temp.equals("[") && bracket.equals("]")) stack.add("3");
            else if (temp.equals("(") || temp.equals("[")) {  // 숫자가 아닐 경우
                System.out.print(0);
                return;
            } else { //숫자일 경우
                if (stack.isEmpty()) {
                    System.out.print(0);
                    return;
                }
                while (!stack.peek().equals("(") && !stack.peek().equals("[")) { // 숫자
                    temp = String.valueOf(Integer.parseInt(stack.pop()) + Integer.parseInt(temp));
                    if (stack.isEmpty()) {
                        System.out.print(0);
                        return;
                    }
                }
                if (stack.isEmpty()) {
                    System.out.print(0);
                    return;
                }
                if (!stack.peek().equals("(") && bracket.equals(")")) {
                    System.out.print(0);
                    return;
                } else if (!stack.peek().equals("[") && bracket.equals("]")) {
                    System.out.print(0);
                    return;
                }

                stack.pop();

                if (bracket.equals(")")) stack.add(String.valueOf(Integer.parseInt(temp) * 2));
                else stack.add(String.valueOf(Integer.parseInt(temp) * 3));
            }

        }

        while (!stack.isEmpty()) {
            if (stack.peek().equals("(") || stack.peek().equals("[")) {  // 숫자가 아닐 경우
                System.out.print(0);
                return;
            } else {
                num += Integer.parseInt(stack.pop());
            }
        }

        System.out.print(num);

        br.close();

    }

}
