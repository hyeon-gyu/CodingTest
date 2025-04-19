class Solution {
    
    public int solution(int[][] board, int[][] skill) {
        int answer = 0;
        // skill의 0번째는 type  1이면 공격, 2면 회복
        
        int row = board.length;
        int col = board[0].length;
        
        int[][] tmp = new int[row+1][col+1];
        for(int[] s : skill) {
            int sX = s[1]; int sY = s[2]; int dX = s[3]; int dY = s[4]; int type = s[0]; int degree = s[5];
            degree = (type == 1) ? degree * (-1) : degree * 1; 
            tmp[sX][sY] += degree;
            tmp[sX][dY+1] -= degree;
            tmp[dX+1][sY] -= degree;
            tmp[dX+1][dY+1] += degree;
        }
        
        for(int i = 0; i < tmp.length; i++) { 
            for(int j = 1; j < tmp[0].length; j++) {
                tmp[i][j] += tmp[i][j-1];
            }
        }
        
        for(int i = 0; i < tmp[0].length; i++) { 
            for(int j = 1; j < tmp.length; j++) {
                tmp[j][i] += tmp[j-1][i];
            }
        }
        
        for(int i = 0; i < tmp.length -1; i++) {
            for(int j = 0; j <tmp[0].length -1; j++) {
                board[i][j] += tmp[i][j];      
                if(board[i][j] > 0) {
                    answer ++;
                }
            }
        }
        
        
        
        return answer;
    }
}