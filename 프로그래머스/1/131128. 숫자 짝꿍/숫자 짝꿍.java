import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        List<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> m = new HashMap<>();
        
        for(int i=0; i<X.length(); i++) {
            m.put(X.charAt(i), m.getOrDefault(X.charAt(i), 0) + 1);    
        }
        for(int i=0; i<Y.length(); i++) {
            if (m.getOrDefault(Y.charAt(i), 0) == 0) {
                continue;
            } else {
                m.put(Y.charAt(i), m.get(Y.charAt(i)) - 1);    
                list.add(Y.charAt(i) - '0');
            }
        }
        if(list.size() == 0) {
            return "-1";
        }
        Collections.sort(list, Collections.reverseOrder());
        for(Integer i : list) {
            sb.append(Integer.toString(i));
        }
        answer = sb.toString();
        if(answer.startsWith("0")) {
            return "0";
        }
        return answer;
    }
}