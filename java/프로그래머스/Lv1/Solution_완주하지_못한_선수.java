
import java.util.*;

class Solution_완주하지_못한_선수 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);

        for(int i=0; i<completion.length; i++){
            if(!participant[i].equals(completion[i]))
                return participant[i];
        }

        return participant[participant.length-1];
    }
}