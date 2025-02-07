import java.util.*;

class Solution {
    public int solution(int[] nums) {

        // 가장 많은 가지수의 폰켓몬을 가져야함
        HashSet<Integer> hs = new HashSet<>();
        
        int need = nums.length / 2;
        for(int i=0; i<nums.length; i++) {
            hs.add(nums[i]);
        }
        if(hs.size() >= need) {
            return need;
        } else {
            return hs.size();
        }
    }
}