import java.util.*;

class Solution {
    
    class Node {
        int x;
        int y;
        int dir;
        int dist;
        
        public Node(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }  
    
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    static boolean[][] visited;
    public int solution(String[] board) {
        int answer = 0;
        
        int n = board.length;
        int m = board[0].length();
        int sx = 0; int sy = 0; // 시작 좌표
        int px = 0; int py = 0; // 종료 좌표
        int[][] graph = new int[n][m];
        visited = new boolean[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(board[i].charAt(j) == 'R') {
                    sx = i; sy = j;
                } else if(board[i].charAt(j) == 'G') {
                    px = i; py = j;
                } else if(board[i].charAt(j) == 'D') {
                    graph[i][j] = 1; 
                } else {
                    graph[i][j] = 0;
                }
            }
        }
        
        // 시작 좌표 queue에 삽입
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(sx,sy,0));
        visited[sx][sy] = true;
        while(!q.isEmpty()) {
            Node node = q.poll();
            if(node.x == px && node.y == py) {
                return node.dist;
            }
            
            for(int i = 0; i < 4; i++) {
                int fx = node.x; int fy = node.y; int cnt = node.dist;
                while(true) {
                    fx += dx[i]; fy += dy[i];
                    if(fx < 0 || fx >= n || fy < 0 || fy >= m) {
                        fx -= dx[i]; fy -= dy[i];
                        break;
                    } else {
                        if(graph[fx][fy] == 1) {
                            fx -= dx[i]; fy -= dy[i];
                            break;
                        }
                    }    
                }
                if(!visited[fx][fy]) {
                    visited[fx][fy] = true;
                    q.offer(new Node(fx, fy, node.dist + 1));
                }
            }
        }
        return -1;
    }
}