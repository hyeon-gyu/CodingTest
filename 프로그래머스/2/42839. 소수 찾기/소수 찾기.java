import java.util.*;

class Solution {
    static List<Integer> result = new ArrayList<>();
    public static boolean isPrime(int num) {
        if (num < 2) {return false;}
        if (num == 2) {return true;}
        if (num % 2 == 0) return false;
        for(int i = 3; i * i <= num; i++) {
            if( num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public int solution(String numbers) {
        int count = 0;
        
        
//         char[] arr= numbers.toCharArray();
//         int[] list = new int[arr.length];
//         for(int i = 0; i < arr.length; i++) {
//             list[i] = arr[i] - '0';
//         }

        boolean[] visited = new boolean[numbers.length()];
        backtracking(numbers, "", visited);
        HashSet<Integer> hs = new HashSet<>();
        Collections.sort(result);
        for(int n : result) {
            hs.add(n);
        }
        for(int n : hs) {
            if(isPrime(n)) {count++;}
        }
        return count;
    }
    
    public static void backtracking(String input, String current, boolean[] visited) {
        
        if(!current.isEmpty()) {
            if(!(current.charAt(0) == 0 && current.length() > 1)) {
                result.add(Integer.parseInt(current));
            }
        }
        
        for(int i = 0; i < input.length(); i++) {
            if(!visited[i]) {
                visited[i] = true;
                backtracking(input, current + input.charAt(i), visited);
                visited[i] = false;
            }
        }
    }
    
}