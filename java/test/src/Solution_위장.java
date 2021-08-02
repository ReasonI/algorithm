import java.util.HashMap;
class Solution_위장 {
    public int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String,Integer> clothesMap = new HashMap<>();

        for(int i = 0; i < clothes.length ; i++){
            clothesMap.put(clothes[i][1],clothesMap.getOrDefault(clothes[i][1],0) + 1);
        }

        for(int clotheNum : clothesMap.values()){
            answer *= clotheNum + 1;
        }

        return answer - 1;
    }
}