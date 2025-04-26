import java.util.*;

class Solution {
    static int[][] graph;
    static boolean[] visited;
    
    public int solution(int n, int[][] costs) {
        int answer = 0;
        
        graph = new int[n][n];
        visited = new boolean[n];
        for(int i = 0; i < costs.length; i++) {
            graph[costs[i][0]][costs[i][1]] = costs[i][2];
            graph[costs[i][1]][costs[i][0]] = costs[i][2];
        }
        
        Set<Integer> set = new HashSet<>();
        
        PriorityQueue<int[]> pq = new PriorityQueue<>( (o1, o2) -> o1[0] - o2[0]);
        pq.offer(new int[] {0, 0});
        while(!pq.isEmpty()) {
            
            int[] cheapest = pq.poll();
            int cost = cheapest[0]; int node = cheapest[1];

            if(visited[node]) continue;
            visited[node] = true;
            set.add(node);
            answer += cost;
            if(set.size() == n) break;
            for(int i = 0; i < graph[node].length; i++) {
                if(graph[node][i] == 0 || visited[i]) continue;
                pq.offer(new int[] {graph[node][i], i});
            }
        }
        
        return answer;
    }
}