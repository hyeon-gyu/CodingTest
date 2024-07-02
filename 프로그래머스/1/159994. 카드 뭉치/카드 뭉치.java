class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int cards1_idx = 0;
        int cards2_idx = 0;
        
        for(String s : goal){
            if(cards1_idx < cards1.length && cards1[cards1_idx].equals(s))
                cards1_idx += 1;
            else if(cards2_idx < cards2.length && cards2[cards2_idx].equals(s))
                cards2_idx += 1;        
            else{
                answer = "No";
                break;
            }
        }
        return answer;
    }
}