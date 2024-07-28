import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        List<Character> arr = new ArrayList<>();
        for(char c : s.toCharArray()){
            if(c == '('){
                arr.add('(');
            }
            else{
                if(arr.size() == 0)
                    return false;
                arr.remove(arr.size()-1);
            }
        }
        if(arr.size()>0){
            return false;
        }
        return answer;
    }
}