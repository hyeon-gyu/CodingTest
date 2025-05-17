class Solution {
    public long solution(int[] diffs, int[] times, long limit) {
        long answer = 0;
        
        // 숙련도의 최소와 최대를 구해서 이진탐색을 진행
        long minL = 1; long maxL = Integer.MAX_VALUE;
        
        while(minL <= maxL) {
            
            long time = 0;
            long level = (minL + maxL) / 2; // 숙련도
            // diff의 처음은 항상 1
            time += times[0];
            for(int i = 1; i < diffs.length; i++) {
                if(diffs[i] > level) {
                    time += times[i] + (times[i-1] + times[i]) * (diffs[i]-level);
                } else {
                    time += times[i];
                }
            }
            if(time > limit) {
                minL = level + 1;
            } else {
                maxL = level -1;
                answer = level;
            }
        }
        return answer;
    }
}