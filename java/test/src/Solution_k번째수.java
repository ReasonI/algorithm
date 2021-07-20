import java.util.*;
class Solution_k번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        answer = new int[commands.length];

        for(int loop1 = 0; loop1< commands.length; loop1++){
            int[] tempArray = new int[commands[loop1][1]-commands[loop1][0]+1];
            int tempIdx = 0;
            for(int i = commands[loop1][0]-1; i < commands[loop1][1]; i++){
                tempArray[tempIdx] = array[i];
                tempIdx++;
            }
            Arrays.sort(tempArray);
            answer[loop1] = tempArray[commands[loop1][2]-1];
        }


        return answer;
    }
}