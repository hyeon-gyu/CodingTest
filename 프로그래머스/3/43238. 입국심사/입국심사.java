import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        
        // 최소 시간과 최대 발생 시간 사이에서 이분 탐색을 진행
        // 최소 1분부터 최대 60분
        long left = 1;
        Arrays.sort(times);        
        long right = n * (long)times[times.length-1];
        while (left <= right) {
            
            long mid = ( left + right) / 2;
            long tot = 0;
            for(int time : times) {
                tot += mid / time;
            }
            
            if (tot >= n) { // 해당 시간 동안 n명보다 더 많이 심사 가능
                answer = mid;
                right = mid -1;
            } else {
                left = mid + 1;
            }
            
        }
        
        return answer;
    }
}