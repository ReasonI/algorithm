import java.util.Arrays;
import java.util.PriorityQueue;

class Solution_디스크_컨트롤러 {
    public int solution(int[][] jobs) {
        int answer = 0;
        int time = 0;
        int jobIdx = 0;
        int jobDone = 0;
        int[] process = new int[2];

        Arrays.sort(jobs, (a,b) -> a[0] - b[0]);

        PriorityQueue<int[]> waitQueue = new PriorityQueue<>((a,b) -> a[1] - b[1]);

        while(jobDone < jobs.length){
            while(jobIdx < jobs.length && jobs[jobIdx][0] <= time){
                waitQueue.add(jobs[jobIdx++]);
            }
            if(waitQueue.isEmpty()){
                time++;
            }else{
                process = waitQueue.poll();
                answer += (time + process[1]) - process[0];
                time += process[1];
                jobDone++;
            }

        }

        return answer/jobs.length;
    }
}
