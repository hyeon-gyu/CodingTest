class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int cnt1 = 0;
        int cnt2 = 0;
        
        char[] array = s.toCharArray();
        for(int i = 0; i < array.length; i++){
            if ((array[i] == 'p') || (array[i] == 'P')){
                cnt1 += 1;
            }
            else if((array[i] == 'y') ||( array[i] == 'Y')){
                cnt2 += 1;
            }
        }
        if (cnt1 != cnt2){
            answer = false;}
        return answer;
    }
}