class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {};
        
        int max = gcd(n,m);
        int min = n * m / max;
        return new int[] {max, min};
    }
    
    public int gcd(int a, int b) {
        if(b == 0) {
            return a;
        }
        return gcd(b, a%b);
    }
}