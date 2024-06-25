import java.util.*;

public class Solution {
    public List<Integer> solution(int []arr) {
        List<Integer> list1 = new ArrayList<>();
        int prev = -1;
        for(int i=0; i< arr.length; i++){
            if(arr[i] != prev){
                list1.add(arr[i]);
                prev = arr[i];
            }
        }

        return list1;
    }
}