import java.util.*;
class Solution {
    public List<Integer> solution(int[] arr, int divisor) {
        List<Integer> list1 = new ArrayList<>();
        
        for(int a : arr){
            if (a % divisor == 0){
                list1.add(a);
            }
        }
        if(list1.size() == 0){
            list1.add(-1);
        }
        Collections.sort(list1);
        return list1;
    }
}