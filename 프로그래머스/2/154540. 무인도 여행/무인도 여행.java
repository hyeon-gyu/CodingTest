import java.util.*;

class Solution {
    
    int[] dx = {0,0,-1,1}; // 전역변수
    int[] dy = {1,-1,0,0};
    
    public int[] solution(String[] maps) {
        List<Integer> list = new ArrayList<>();
        
        int x = maps.length;
        int y = maps[0].length();
        int[][] m = new int[x][y];
        boolean[][] visited = new boolean[x][y];
        for(int i=0; i<m.length; i++) {
            for(int j=0; j<maps[i].length(); j++) {
                if(maps[i].charAt(j) == 'X') {
                    m[i][j] = 0;
                }
                else { m[i][j] = maps[i].charAt(j) - '0'; }
                visited[i][j] = false;
            }
        }

        for(int i=0; i<m.length; i++) {
            for(int j=0; j<m[i].length; j++) {
                int cnt = 0;
                if(m[i][j] == 0 || visited[i][j] == true) {continue;}
                list.add(dfs(i,j,visited, m, cnt));        
            }
        }
        if(list.size() == 0) {
            int[] a = new int[1];
            a[0] = -1;
            return a;
        }
        Collections.sort(list);
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
    
    public Integer dfs(int cx, int cy, boolean[][] visited, int[][] m, int cnt) {
        visited[cx][cy] = true;
        cnt = m[cx][cy];
        for(int k=0; k<4; k++) {
            int nx = cx + dx[k];
            int ny = cy + dy[k];
            if(nx >= 0 && nx < m.length && ny >= 0 && ny < m[0].length && !visited[nx][ny] && m[nx][ny] != 0) {
                cnt += dfs(nx, ny, visited, m, cnt);
            }
        }
        return cnt;
    }
}