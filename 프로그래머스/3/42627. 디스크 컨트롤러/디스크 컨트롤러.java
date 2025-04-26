import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        
        Arrays.sort(jobs, (o1, o2) -> o1[0] - o2[0]);
        // jobs를 요청시간 순으로 정렬
        
        // 우선순위 소요시간 짧은거 - 요청시각 빠른거 - 번호가 작은거
        Queue<int[]> pq = new PriorityQueue<>( (o1, o2) -> {
            
            int duringTime1 = o1[1];
            int duringTime2 = o2[1];
            if(duringTime1 != duringTime2) {return duringTime1 - duringTime2;}
            else {
                int requestTime1 = o1[0];
                int requestTime2 = o2[0];
                return requestTime1 - requestTime2;
            }
        });     
        
        int idx = 0; 
        int total = jobs.length; int cnt = 0; int time = 0;
        
        while(cnt < total) {
            
            while(idx < total && jobs[idx][0] <= time) {
                pq.offer(new int[] {jobs[idx][0], jobs[idx][1] });
                idx++;
            }
            if (pq.isEmpty()) {
                if (idx < total) time = jobs[idx][0];
                else break;
            } else {
                int[] info = pq.poll();
                cnt++;
                time += info[1];
                answer += (time - info[0]);
            }
        }
        return answer / total;
    }
}