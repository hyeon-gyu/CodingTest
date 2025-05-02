class Solution {
    
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int count = 0;
        
        int n = board.length;
        int m = board[0].length;
        String color = board[h][w];
        for(int i = 0; i < 4; i++) {
            int fx = h + dx[i];
            int fy = w + dy[i];
            if(fx < 0 || fx >= n || fy < 0 || fy >= m) continue;
            if(board[fx][fy].equals(color)) {
                count++;
            }
        }
        return count;
    }
}