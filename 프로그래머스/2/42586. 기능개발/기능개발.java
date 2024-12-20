import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> res = new ArrayList<>(); // 남아있는 일 수 저장 리스트
        List<Integer> answer = new ArrayList<>();
        for(int i=0; i < progresses.length; i++) {
            int days = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
            res.add(days); // 7 3 9 
        }
        
        int maxDay = res.get(0);
        int cnt = 1;
        for(int i = 1; i < res.size(); i++) {
            if(res.get(i) <= maxDay) {
                cnt ++;
            } else {
                answer.add(cnt);
                cnt = 1;
                maxDay = res.get(i);
            }
        }
        answer.add(cnt);
        return answer.stream().mapToInt(i -> i).toArray();
    }
}