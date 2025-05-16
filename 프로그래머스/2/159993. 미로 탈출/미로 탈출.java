import java.util.*;

class Node {
    int cx; int cy; int time;
    public Node(int x, int y, int t) {
        this.cx = x; this.cy = y; this.time = t;
    }
}

class Solution {
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static boolean[][] visited;
    
    public int solution(String[] maps) {
        int answer = 0;
        
        int n = maps.length;
        int m = maps[0].length();
        
        char[][] graph = new char[n][m];
        visited = new boolean[n][m];
        
        int sx = 0; int sy = 0; int fx = 0; int fy = 0; int lx = 0; int ly = 0; // 시작, 끝, 레버 좌표 순
        
        for(int i = 0; i < n; i++) {
            String s = maps[i];
            for(int j = 0; j < m; j++) {
                graph[i][j] = s.charAt(j);
                if(graph[i][j] == 'S') {
                    sx = i; sy = j;
                } else if(graph[i][j] == 'L') {
                    lx = i; ly = j;
                } else if (graph[i][j] == 'E') {
                    fx = i; fy = j;
                }
            }
        }
        
        boolean findL = false;
        Queue<Node> q1 = new LinkedList<>();
        q1.offer(new Node(sx, sy, 0));
        visited[sx][sy] = true;
        while(!q1.isEmpty()) {
            Node node = q1.poll();
            if(node.cx == lx && node.cy == ly) {
                answer += node.time;
                findL = true;
                visited = new boolean[n][m];
                break;
            }
            for(int i = 0; i < 4; i++) {
                int nx = node.cx + dx[i];
                int ny = node.cy + dy[i];
                if(nx < 0 || nx >= n || ny < 0 || ny >= m || visited[nx][ny] || graph[nx][ny] == 'X') continue;
                q1.offer(new Node(nx,ny, node.time+1));
                visited[nx][ny] = true;
            }
        }
        if(!findL) return -1;
        
        Queue<Node> q2 = new LinkedList<>();
        q2.offer(new Node(lx,ly,0));
        visited[lx][ly] = true;
        while(!q2.isEmpty()) {
            Node node = q2.poll();
            if(node.cx == fx && node.cy == fy) {
                answer += node.time;
                return answer;
            }
            for(int i = 0; i < 4; i++) {
                int nx = node.cx + dx[i];
                int ny = node.cy + dy[i];
                if(nx < 0 || nx >= n || ny < 0 || ny >= m || visited[nx][ny] || graph[nx][ny] == 'X') continue;
                q2.offer(new Node(nx,ny,node.time+1));
                visited[nx][ny] = true;
            }
        }
        
        
        return -1;
    }
}