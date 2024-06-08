import java.util.*;
class Solution {
    public boolean solution(int x) {
        String [] tmp = String.valueOf(x).split("");
        System.out.println(Arrays.toString(tmp));
        int sum=0;
        for(String s : tmp) {
            sum+=Integer.parseInt(s);
        }

        if(x%sum==0) {
            return true;
        } else {
            return false;
        }
    }
}