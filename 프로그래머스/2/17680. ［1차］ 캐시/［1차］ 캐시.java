import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        LinkedList<String> cache = new LinkedList<>();
        
        if (cacheSize == 0) {return cities.length * 5;}
        
        for (String city : cities) {
            city = city.toLowerCase(); 
            
            if (cache.remove(city)) { // hit
                cache.addFirst(city);
                answer += 1;
            } else { // miss
                if (cache.size() >= cacheSize) {
                    cache.removeLast(); // 가장 오래된 항목 제거
                }
                cache.addFirst(city);
                answer += 5;
            }
        }
        return answer;
    }
}