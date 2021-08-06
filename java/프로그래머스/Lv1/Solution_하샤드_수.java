class Solution_하샤드_수 {
    public boolean solution(int x) {
        boolean answer = true;

        int sum = 0;
        int divNum = x;

        while(divNum > 0){
            sum += divNum % 10;
            divNum /= 10;
        }
        if( x % sum != 0){
            answer = false;
        }
        return answer;
    }
}