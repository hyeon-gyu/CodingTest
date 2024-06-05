class Solution {
    public int[] solution(long n) {
       
        String numStr = Long.toString(n);
        int[] answer = new int[numStr.length()];
        for(int i = 0; i < numStr.length(); i++){
            answer[i] = (int)(n%10);
            n /= 10;
        }
        return answer;
    }
}