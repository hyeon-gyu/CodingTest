import java.util.*;
class Solution {
    public int solution(int[] order) {
        int answer = 0;

        Stack<Integer> st = new Stack<>(); // 보조컨테이너
        int num = 1; // 현재 필요로 하는 숫자
        for(int i=0; i<order.length; i++) {
            for(int j = num; j < order[i]; j++ ) {
                st.push(j);
                num ++;
            }
            if(num == order[i]) {
                answer ++;
                num ++;
            } else if ( !st.isEmpty() && st.peek() == order[i]) {
                answer ++;
                st.pop();
            } else {
                break;
            }
            
        }
        return answer;
    }
}