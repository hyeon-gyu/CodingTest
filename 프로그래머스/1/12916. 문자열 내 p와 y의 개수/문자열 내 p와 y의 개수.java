class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int cnt1 = 0;
        int cnt2 = 0;
        s = s.toLowerCase();
        char[] array = s.toCharArray();
        
        for(int i = 0; i < array.length; i++){
            if (array[i] == 'p'){
                cnt1 += 1;
            }
            else if(array[i] == 'y'){
                cnt2 += 1;
            }
        }
        if (cnt1 != cnt2){
            answer = false;}
        return answer;
    }
}