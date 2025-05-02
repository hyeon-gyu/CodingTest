import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < skill.length(); i++) {
            set.add(skill.charAt(i));
        }
        int idx; int cnt;
        char[] arr = skill.toCharArray();
        
        for(String s : skill_trees) {
            idx = 0; boolean invalid = false;
            for(Character c : s.toCharArray()) {
                if(!set.contains(c)) continue;
                if (arr[idx] == c) {
                    idx++;
                } else {
                    invalid = true;
                    break;
                }
            }
            
            if(idx == skill.length() || !invalid) {
                answer++;
            }
            
        }
        
        return answer;
    }
}