class Solution {
    public int solution(int n) {
        int answer = n;
        String nBinary = Integer.toBinaryString(n);
        int nCount = countOne(nBinary);

        while(true){
            answer++;
            if(nCount == countOne(Integer.toBinaryString(answer))){
                break;
            }

        }
        return answer;
    }

    public int countOne(String binary){
        char[] bin = binary.toCharArray();
        int count = 0;
        for(char num : bin){
            if(num == '1'){
                count++;
            }
        }

        return count;

    }
}