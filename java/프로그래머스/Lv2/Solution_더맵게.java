import java.util.*;

class Solution_더맵게 {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        Arrays.sort(scoville);

        Stack<Integer> scoStack = new Stack<>();

        for(int i = scoville.length - 1 ; i > -1; i--){
            scoStack.push(scoville[i]);
        }

        while(true){
            if(scoStack.size() < 2){
                return -1;
            }
            if(scoStack.peek() < 7){
                scoStack.push(scoStack.pop() + scoStack.pop() * 2);
                answer++;
            }else{
                break;
            }

        }
        return answer;
    }
}