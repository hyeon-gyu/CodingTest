class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt1 = Integer.bitCount(n);
        while(true){
            n++;
            if(cnt1 == Integer.bitCount(n)){
                break;
            }
        }
        return n;
    }
}