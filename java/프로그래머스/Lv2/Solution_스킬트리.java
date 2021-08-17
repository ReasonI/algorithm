class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for(String skillTree : skill_trees){

            for(int i = 0; i < skillTree.length();i++){
                String word = skillTree.substring(i, i + 1);
                if(!skill.contains(word)){
                    skillTree = skillTree.replace(word, "");
                    i--;
                }
            }

            if(skill.indexOf(skillTree) == 0){
                answer++;
            }

        }

        return answer;
    }
}