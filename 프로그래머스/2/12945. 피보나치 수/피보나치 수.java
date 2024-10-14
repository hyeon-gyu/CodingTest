class Solution {
    public int solution(int n) {
        int a = 0;  
        int b = 1;  
        int mod = 1234567;

        for (int i = 2; i <= n; i++) {
            int next = (a + b) % mod;  // F(n) = F(n-1) + F(n-2) % 1234567
            a = b;  // F(n-2) 자리에 F(n-1)를 배치
            b = next;  // F(n-1) 자리에 F(n)를 배치
        }

        return b;  
    }
}