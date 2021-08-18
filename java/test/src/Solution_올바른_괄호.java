import java.util.Stack;

class Solution_올바른_괄호 {
    boolean solution(String s) {
        boolean answer = true;

        Stack<String> st = new Stack<>();

        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ')'){
                if(st.isEmpty()){
                    return answer = false;
                }else{
                    st.pop();
                }
            }else{
                st.push("(");
            }
        }

        if(!st.isEmpty()){
            return answer = false;
        }

        return answer;
    }
}