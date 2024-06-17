import java.util.*;
class Solution {
    public List<Integer> solution(int[] arr) {

        List<Integer> answer = new ArrayList<>();
        if(arr.length == 1){
            answer.add(-1);
            return answer;
        }
        else{
            int[] arr2 = Arrays.copyOf(arr, arr.length);
            Arrays.sort(arr2);
            int min = arr2[0];
            for(int i=0;i<arr.length;i++){
                if(arr[i] == min)
                    continue;
                answer.add(arr[i]);
            }
        }
        return answer;
    }
}