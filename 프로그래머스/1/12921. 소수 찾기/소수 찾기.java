import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        // 1부터 n까지 
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for(int i=2; i*i<=n; i++) {
            if(isPrime[i]) {
                for(int j=i*i; j<= n; j+=i) {
                    isPrime[j] = false;
                }    
            }
        }
        for(int i=2; i<isPrime.length; i++) {
            if(isPrime[i] == true) 
                answer++;
        }
        return answer;
    }
}