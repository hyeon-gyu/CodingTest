import java.util.*;

class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        
        List<int[]> dp = new ArrayList<>();
        for(int i=0; i<triangle.length; i++) {
            dp.add(new int[triangle[i].length]);
            Arrays.fill(dp.get(i), 0);
        }
        dp.get(0)[0] = triangle[0][0];
        dp.get(1)[0] = triangle[1][0] + dp.get(0)[0];
        dp.get(1)[1] = triangle[1][1] + dp.get(0)[0];
        for(int i=2; i<triangle.length; i++) {
            for(int j=0; j<triangle[i].length; j++) {
                if(j==0) {
                    dp.get(i)[j] = dp.get(i-1)[j] + triangle[i][j];
                }  else if(j==triangle[i].length-1) {
                    dp.get(i)[j] = dp.get(i-1)[j-1] + triangle[i][j];
                }
                else {
                    dp.get(i)[j] = Math.max(dp.get(i-1)[j-1] + triangle[i][j], dp.get(i-1)[j] +  + triangle[i][j]);   
                }
            }
        }
        int maxStep = dp.size();
        int[] arr = dp.get(maxStep-1);
        for(int i=0; i<arr.length; i++) {
            if (arr[i] > answer) {
                answer = arr[i];
            }
        }
        return answer;
    }
}