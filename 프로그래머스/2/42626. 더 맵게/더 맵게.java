import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        //  가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
        // 가장 앞에서 부터 두개씩 제거하고 새로운 인자를 제일 앞에 넣을 수 있는 자료구조
        // System.out.println();   
        // 오름차순 자동 정렬된 걸로 ProrityQueue
        if(scoville.length < 2) {
            return scoville[0] >= K ? 0 : -1;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int s : scoville) {
            pq.offer(s);
        }
        while(pq.size() > 1 && pq.peek() < K) {
            
            int q1 = pq.poll();
            int q2 = pq.poll();
            pq.offer(q1 + q2*2);
            answer ++;
        }
        return pq.peek() >= K ? answer : -1;
    }
}