class Solution_타겟_넘버 {
    static int answer = 0;
    public void dfs(int[] numbers, int target, int idx, int sum){
        if(idx == numbers.length){
            if(sum == target){
                answer++;
            }
            return;
        }

        sum += numbers[idx];
        dfs(numbers, target, idx + 1, sum);

        sum -= numbers[idx]*2;
        dfs(numbers, target, idx + 1, sum);
    }
    public int solution(int[] numbers, int target) {

        dfs(numbers, target, 0, 0);

        return answer;
    }
}