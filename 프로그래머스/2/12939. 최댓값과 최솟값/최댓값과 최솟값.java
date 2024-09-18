class Solution {
    public String solution(String s) {
        String[] numbers = s.split(" "); 
        int max = Integer.MIN_VALUE; 
        int min = Integer.MAX_VALUE;
        
        for (String num : numbers) {
            int number = Integer.parseInt(num);
            if (number > max) {
                max = number; 
            }
            if (number < min) {
                min = number;
            }
        }
        return min + " " + max;
    }
}