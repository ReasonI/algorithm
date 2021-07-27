import java.util.*;
class Solution_다리를_지나는_트럭 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {

        int answer = 0;
        int truck_weight_idx = 0;
        int bridge_weight = 0;

        Queue<Integer> bridge = new LinkedList<>();

        while(true){
            if(truck_weight_idx == truck_weights.length){
                break;
            }
            if(bridge_length == bridge.size()){
                bridge_weight -= bridge.poll();
            }
            else if(bridge_weight + truck_weights[truck_weight_idx] > weight){
                bridge.add(0);
                answer++;
            }else{
                bridge_weight += truck_weights[truck_weight_idx];
                bridge.add(truck_weights[truck_weight_idx]);
                answer++;
                truck_weight_idx++;

            }
        }

        return answer + bridge_length;
    }
}