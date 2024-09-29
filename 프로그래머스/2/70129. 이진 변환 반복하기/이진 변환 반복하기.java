import java.util.*;
// System.out.println()
class Solution {
    public int[] solution(String s) {
        // 0 제거 이후 길이값을 2진수로 표현하고 또 0제거 이후 길이값 2진수로...
        List<Integer> answer = new ArrayList<>();
        int c_cnt = 0; // 이진 변환 횟수
        int d_cnt = 0; // 0 제거 횟수
        while(!s.equals("1")){
            c_cnt += 1;
            String[] res = s.split("");
            for(int i=0; i< res.length; i++){
                if(res[i].equals("0")){
                    d_cnt += 1;
                }
            }
            s = s.replace("0", "");
            int tmp = s.length();
            s = Integer.toBinaryString(tmp);
        }
        answer.add(c_cnt);
        answer.add(d_cnt);
        return answer.stream().mapToInt(i -> i).toArray();
    }
}