class Solution_소수_만들기 {
    public int solution(int[] nums) {
        int answer = 0;
        int num = 0;
        boolean status = true;

        for(int i = 0; i < nums.length - 2; i++){
            for(int j = i + 1; j < nums.length - 1; j++){
                for (int k = j + 1; k < nums.length; k++){
                    num = nums[i] + nums[j] + nums[k];
                    status = true;
                    for(int x = 2; x < num; x++){

                        if(num % x == 0){
                            status = false;
                            break;
                        }
                    }
                    if(status == true){
                        answer++;
                    }
                }

            }
        }

        return answer;
    }
}
