import java.util.*;
class Solution_기능개발 {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};

        int[] days = new int[progresses.length];

        for(int i = 0; i < progresses.length; i++){
            days[i] = (int) Math.ceil( (double) (100 - progresses[i]) / speeds[i]);
        }

        ArrayList<Integer> answerList = new ArrayList<>();

        int priorityDay = days[0];
        int count = 1;
        int j = 0;

        System.out.println(Arrays.toString(days));

        for(int i = 1; i < days.length; i++){
            if(priorityDay >= days[i]){
                count++;
            }else{
                priorityDay = days[i];
                answerList.add(count);
                count = 1;
                j++;
            }
        }
        answerList.add(count);

        answer = new int[answerList.size()];
        for(int i = 0; i < answerList.size(); i++){
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}