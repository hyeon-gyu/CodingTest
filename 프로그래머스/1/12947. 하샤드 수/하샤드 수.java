class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int tmp = x;
        int sum = 0;
        while(x >= 10){
            int mod = x % 10;
            sum += mod;
            x = x / 10;
        }
        sum += x;
        System.out.println(sum);
        if(tmp % sum != 0){
            answer = false;
        }
        return answer;
    }
}