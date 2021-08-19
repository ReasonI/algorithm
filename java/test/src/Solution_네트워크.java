class Solution_네트워크 {
    public void dfs(int idx, int[][] computers, boolean[] network){
        for(int j = 0; j < computers.length; j++){
            if(computers[idx][j] == 1 && !network[j]){
                network[j] = true;
                dfs(j, computers, network);
            }else if(j == computers.length - 1){
                return;
            }
        }
    }
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] network = new boolean[n];

        for(int idx = 0; idx < n; idx++){
            if(network[idx] == false){
                answer++;
                dfs(idx, computers, network);
            }
        }

        return answer;
    }
}