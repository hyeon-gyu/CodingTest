import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        // 동명이인 때문에 set은 안되는데
        HashMap<String, Integer> m = new HashMap<>();
        for(String p : participant) {
            m.put(p, m.getOrDefault(p, 0) + 1);
        }
        for(String c : completion) {
            m.put(c, m.get(c) - 1);
        }
        for(Map.Entry<String, Integer> e : m.entrySet()) {
            if(e.getValue() == 1) {
                answer = e.getKey();
                break;
            }
        }
        return answer;
    }
}