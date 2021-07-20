import java.util.*;
class Solution_모의고사 {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] count = new int[3];
        ArrayList<Integer> answerList = new ArrayList<Integer>();

        int[] student1 = {1,2,3,4,5};
        int[] student2 = {2,1,2,3,2,4,2,5};
        int[] student3 = {3,3,1,1,2,2,4,4,5,5};

        for(int i = 0; i < answers.length; i++){
            if(student1[i%student1.length] == answers[i]){
                count[0]++;
            }
            if(student2[i%student2.length] == answers[i]){
                count[1]++;
            }
            if(student3[i%student3.length] == answers[i]){
                count[2]++;
            }
        }

        int max = Math.max(Math.max(count[0],count[1]), count[2]);

        for(int i = 0; i < 3; i++){
            if( max == count[i]){
                answerList.add(i+1);
            }
        }

        answer = new int[answerList.size()];

        for(int i = 0; i < answerList.size(); i++){
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}