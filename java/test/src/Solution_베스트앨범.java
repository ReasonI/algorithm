import java.util.HashMap;
class Solution_베스트앨범 {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};

        HashMap<String, Integer> genresSum = new HashMap<>();

        for(int i = 0; i < genres.length; i++){
            genresSum.put(genres[i], genresSum.getOrDefault(genres[i], 0) + plays[i]);
        }

        return answer;
    }
}