import java.util.*;

class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;
        Arrays.sort(arrayA);        
        Arrays.sort(arrayB);
        
        int gcd1 = arrayA[0];
        int gcd2 = arrayB[0];
        
        for(int i = 1; i < arrayA.length; i++) {
            gcd1 = gcd(arrayA[i], gcd1);
            gcd2 = gcd(arrayB[i], gcd2);
        }
        
        if(!canDivide(arrayB, gcd1)) {
            answer = Math.max(answer, gcd1);
        }
        
        if(!canDivide(arrayA, gcd2)) {
            answer = Math.max(answer, gcd2);
        }
        
        return answer;
    }
    
    public static int gcd(int a, int b) {
        if(b == 0) return a;
        else return gcd(b, a % b);
    }
    
    public static boolean canDivide(int[] array, int gcd) {
        for(int n : array) {
            if(n % gcd == 0) {
                return true;
            }
        }
        return false;
    }
    
    
}