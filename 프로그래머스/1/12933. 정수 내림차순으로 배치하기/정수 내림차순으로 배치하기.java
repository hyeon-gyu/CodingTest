import java.util.*;
class Solution {
    public long solution(long n) {
        String num = Long.toString(n);
        char[] numArr = num.toCharArray();
        
        Arrays.sort(numArr);
        String answer = "";
        for(int i = numArr.length -1; i >= 0; i--){
            answer += numArr[i];
        }
        return Long.parseLong(answer);
    }
}