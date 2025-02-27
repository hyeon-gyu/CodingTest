import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        // 모든 경우를 다 탐색해봐야할 것 같음. 
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        for(int i=0; i<works.length; i++) {
            pq.add(works[i]);
        }
        // System.out.println(pq.remove());
        while(n > 0 && !pq.isEmpty()) {
            int max = pq.poll();
            if(max > 1) {
                pq.add(max -1);    
            }
            n--;
        }

        while(!pq.isEmpty()) {
            answer += Math.pow(pq.poll(),2);
        }
        return answer;
    }
}