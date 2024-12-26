import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        HashMap<String, Integer> m = new HashMap<>();
        for(String[] cloth : clothes) {
            if(m.containsKey(cloth[1])) {
                m.put(cloth[1], m.get(cloth[1]) + 1);
            }
            else{
                m.put(cloth[1], 1);
            }
        }

        
        if (m.size() == 0) {return clothes.length;}
        return m.values().stream().reduce(1, (a, b) -> a * (b+1)) -1;
    }
}