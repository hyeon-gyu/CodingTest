import java.util.*;
class Solution {
    public int[] solution(int n, int s) {
        int[] answer = new int[n];
        if(s < n) {
            return new int[]{-1};
        }
        
        // 3 9가 들어오면 1 1 8부터 1 2 7 다 순회한다? 불가능
        // 최대한 균등하게 분배해야 최대곱 산출 가능
        
        int div = s / n;
        int mod =  s % n;
        for(int i=0; i<answer.length; i++) {
            answer[i] = div;
        }
        
        for(int i=0; i<mod; i++) {
            answer[i] += 1;
        }
        Arrays.sort(answer);
        return answer;
    }
}