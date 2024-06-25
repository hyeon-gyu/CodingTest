class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int[][] arr = new int[sizes.length][sizes[0].length];
        for(int i =0; i< sizes.length; i++){
            for(int j= 0; j< 1; j++){
                if(sizes[i][j] > sizes[i][j+1]){
                    arr[i][j] = sizes[i][j];
                    arr[i][j+1] = sizes[i][j+1];
                }else{
                    arr[i][j+1] = sizes[i][j];
                    arr[i][j] = sizes[i][j+1];  
                }
            }
        }
        int max_x = 0; int max_y = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] > max_x) {
                max_x = arr[i][0];
            }
            if (arr[i][1] > max_y) {
                max_y = arr[i][1];
            }
        }
        answer = max_x * max_y;
        return answer;
    }
}