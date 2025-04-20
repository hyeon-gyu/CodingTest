import java.util.*;
class Solution {
    
    static int[] dx = {1, 0, -1}; // 아래 오른쪽 왼쪽위
    static int[] dy = {0, 1, -1};
    
    public int[] solution(int n) {
        int[] answer = {};
        // 1  0  0 0
        // 2  9  0 0
        // 3  10 8 0
        // 4  5  6 7
        int[][] tri = new int[n][n];
        
        // 최종 숫자
        int fin = (n * (n+1)) / 2;
        int num = 1;
        int x = 0; int y = 0; int dir = 0;
        
        while(num <= fin) {
            tri[x][y] = num++; 
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            
            if(nx < 0 || ny < 0 || nx >= n || ny >= n || tri[nx][ny] != 0) {
                dir = (dir + 1) % 3;
                nx = x + dx[dir];
                ny = y + dy[dir];
            }
            
            x = nx;
            y = ny;
        }
        
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                list.add(tri[i][j]);
            }
        }
        
        return list.stream().mapToInt(i->i).toArray();
    }
}