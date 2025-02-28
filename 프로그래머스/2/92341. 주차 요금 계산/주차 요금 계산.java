import java.util.*;

class Solution {
    public Integer[] solution(int[] fees, String[] records) {
        int basicTime = fees[0];
        int originalFee = fees[1];
        int perTime = fees[2];
        int perFee = fees[3];
        
        HashMap<String, String> m = new HashMap<>(); // 들어온 차량 추적 용도
        HashMap<String, Integer> totalFee = new HashMap<>();
        
        PriorityQueue<Integer[]> pq = new PriorityQueue<>( (o1, o2) -> o1[0].compareTo(o2[0]));
        for(String record : records) {
            if(record.charAt(11) == 'I') {
                // System.out.println(record.substring(6,10));
                m.put(record.substring(6,10), record.substring(0,5));
            } else {
                String inTime = m.remove(record.substring(6,10)); // 들어온 시간
                String outTime = record.substring(0,5);
                // 05:34 부터 07:59까지 시간 계산 -> 
                Integer usingTime = (Integer.parseInt(outTime.substring(0,2)) * 60 + Integer.parseInt(outTime.substring(3,5))) - (Integer.parseInt(inTime.substring(0,2)) * 60 + Integer.parseInt(inTime.substring(3,5)));
                
                totalFee.put(record.substring(6,10), totalFee.getOrDefault(record.substring(6,10), 0) + usingTime);
            } 
        }
        for(String key : m.keySet()) {
            String time = m.get(key);
            Integer usingTime = (23 * 60 + 59) - (Integer.parseInt(time.substring(0,2)) * 60 + Integer.parseInt(time.substring(3,5)));
            totalFee.put(key, totalFee.getOrDefault(key, 0) + usingTime);
        }
        for(String key : totalFee.keySet()) {
            int totalTime = totalFee.get(key);
            if(totalTime <= basicTime) {
                pq.offer(new Integer[]{Integer.parseInt(key), originalFee});
            } else {
                pq.offer(new Integer[]{Integer.parseInt(key), originalFee + (int)Math.ceil((double)(totalTime-basicTime) / perTime) * perFee});
            }
        }
        
        Integer[] answer = new Integer[pq.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = pq.poll()[1];
        }
        return answer;
    }
}