import java.util.*;

class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long sum = 0;
        for(int i=1; i<= count; i++){
            sum += price * i;
        }
        
        return (money > sum) ? 0 : Math.abs(sum-money);
    }
}