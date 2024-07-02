class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int prev_rng = 0;
        for(int i=0; i< section.length; i++){
            if(prev_rng > section[i])
                continue;
            answer += 1;
            prev_rng = section[i] + m;
            
        }
        return answer;
    }
}