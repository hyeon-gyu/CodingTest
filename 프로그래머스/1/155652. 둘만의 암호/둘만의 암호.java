import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        StringBuffer sb = new StringBuffer();
        Set<Character> skipSet = new HashSet<>();
        for(char c : skip.toCharArray()){
            skipSet.add(c);
        }
        for(char k : s.toCharArray()){
            int count = 0;
            while(count < index){
                k++;
                if(k > 'z'){
                    k = 'a';
                }
                if(!skipSet.contains(k))
                    count++;
            }
            sb.append(k);
        } 
        return sb.toString();
    }
}