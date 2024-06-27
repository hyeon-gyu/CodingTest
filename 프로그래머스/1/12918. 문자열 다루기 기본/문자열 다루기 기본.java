class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        char[] arr = s.toCharArray();

        if (arr.length != 4 && arr.length != 6){
            return false;
        }    
        for(char c : arr){
            if(Character.isDigit(c)){
                continue;
            }
            else{
                return false;
            }
        }
        return answer;
    }
}