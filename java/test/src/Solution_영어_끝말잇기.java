class Solution_영어_끝말잇기 {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};

        char last = ' ';
        char first = ' ';

        for(int i = 0; i < words.length; i++){
            if (last == ' '){
                last = words[i].charAt(words[i].length() - 1);
                continue;
            }else{
                first = words[i].charAt(0);

                if(first != last){
                    answer[0] = i % n;
                    answer[1] = i / n;
                }
            }

            last = words[i].charAt(words[i].length() - 1);
        }

        System.out.println("Hello Java");

        return answer;
    }
}