import java.util.*;

class Solution_더맵게 {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        Arrays.sort(scoville);

        PriorityQueue<Integer> scoHeap = new PriorityQueue<>();

        for(int scov : scoville){
            scoHeap.offer(scov);
        }

        while(scoHeap.peek() < K){
            if(scoHeap.size() < 2){
                return -1;
            }
            scoHeap.offer(scoHeap.poll() + scoHeap.poll() * 2);
            answer++;

        }
        return answer;
    }
}