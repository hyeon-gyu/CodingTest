import java.util.*;

class Solution {
    public List<Integer> solution(int[] array, int[][] commands) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i=0;i<commands.length; i++){
            List<Integer> narr = new ArrayList<>();
            for(int j=commands[i][0]; j <= commands[i][1]; j++){
                narr.add(array[j-1]);
            }
            Collections.sort(narr);
            answer.add(narr.get(commands[i][2]-1));
        }
        
        return answer;
    }
}