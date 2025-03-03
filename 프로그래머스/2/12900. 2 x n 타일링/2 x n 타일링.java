class Solution {
    public int solution(int n) {
        int answer = 0;
        // 타일 4개로 5개의 경우 생성가능
        n = n % 1000000007;
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        // n이 1이면 1개
        // n이 2이면 2개
        // n이 3이면 3개
        // n이 4이면 5개
        for(int i=3; i<=n; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 1000000007;
        }

        return dp[n] ;
    }

}