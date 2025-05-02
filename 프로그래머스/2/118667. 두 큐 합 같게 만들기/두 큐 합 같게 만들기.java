import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        
        Queue<Long> q1 = new LinkedList<>();
        Queue<Long> q2 = new LinkedList<>();
        long sum1 = 0; long sum2 = 0;
        for(int i = 0; i < queue1.length; i++) {
            Long l1 = Long.valueOf(queue1[i]);
            q1.offer(l1);
            sum1 += queue1[i];
            Long l2 = Long.valueOf(queue2[i]);
            q2.offer(l2);
            sum2 += queue2[i];
        }
        
        while(true) { 
            if(sum1 > sum2 ) {
                long n1 = q1.poll();
                sum1 -= n1;
                q2.offer(n1);
                sum2 += n1;
                answer++;
            } else if (sum1 < sum2) {
                long n2 = q2.poll();
                sum2 -= n2;
                q1.offer(n2);
                sum1 += n2;
                answer++;
            } else {
                break;
            }
            if(answer >= 600000) {
                return -1;
            }
        }
        return answer;
    }
}