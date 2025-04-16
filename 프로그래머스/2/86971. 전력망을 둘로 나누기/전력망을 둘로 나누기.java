import java.util.*;

class Solution {
    
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        
        graph = new ArrayList[n+1];
        for(int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        
        // 인접 행렬 만들기
        for(int[] wire : wires) {
            int a = wire[0];
            int b = wire[1];
            graph[a].add(b);
            graph[b].add(a);
        }
        
        for(int[] wire : wires) {
            int a = wire[0];
            int b = wire[1];
            
            visited = new boolean[n+1];
            
            graph[a].remove(Integer.valueOf(b));
            graph[b].remove(Integer.valueOf(a));
            int cnt = dfs(a);
            
            int diff = Math.abs(cnt - (n-cnt));
            answer = Math.min(answer, diff);
            
            graph[a].add(b);
            graph[b].add(a);
        }
        
        // 전체 노드는 n개 니까 처음 끊어서 dfs로 탐색한 노드 개수와 n-탐색한 노드 개수 차이가 최소인걸 찾는거다
    
        return answer;
    }
    
    public int dfs(int a) {
        visited[a] = true;
        int count = 1;
                
        for(int next : graph[a]) {
                if(!visited[next]) {
                    count += dfs(next);
                }
            }
        return count;
    }
}