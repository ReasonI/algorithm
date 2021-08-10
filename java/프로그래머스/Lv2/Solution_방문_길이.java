class Solution_방문_길이 {
    public int solution(String dirs) {
        int answer = 0;
        int startX = 0;
        int startY = 0;
        int endX = 5;
        int endY = 5;
        int index = 0;

        int[] dX = {-1,1,0,0};
        int[] dY = {0,0,-1,1};
        boolean[][][][] visit = new boolean[11][11][11][11];

        for(String dir : dirs){
            startX = endX;
            startY = endY;

            switch(dir){
                case "U" :
                    index = 3;
                    break;
                case "D" :
                    index = 2;
                    break;
                case "R" :
                    index = 1;
                    break;
                case "L" :
                    index = 0;
                    break;
                default :
                    break;
            }

            endX = dX[index];
            endY = dY[index];

            if(endX < 0 || endY < 0 || endX > 10 || endY > 10){
                endX = startX;
                endY = startY;
            }

            // if(!visit[startX][startY][endX][endY] && !visit)
        }

        return answer;
    }
}