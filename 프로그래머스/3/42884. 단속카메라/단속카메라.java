import java.util.*;


class Solution {
    public int solution(int[][] routes) {
        
        
        int answer = 0;
        int camera = Integer.MIN_VALUE;
        
        // -18:-13 -> -20:-15 -> -14:-5 -> -5:-3
        
        Arrays.sort(routes, (a,b) -> Integer.compare(a[1], b[1]));
        
        for (int[] route : routes) {
            if (route[0] > camera) { // 현재 카메라로 감시 불가하면
                camera = route[1];  // 새로운 카메라 설치
                answer++;
            }
        }
        return answer;
    }
}