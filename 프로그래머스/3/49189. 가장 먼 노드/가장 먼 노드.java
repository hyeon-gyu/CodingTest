import java.util.*;

class Solution {
    
    public int solution(int n, int[][] edge) {
        
        int answer = 0;
        
        int[] result = new int[n+1]; // i번 노드까지 소요되는 비용 저장
        Arrays.fill(result, Integer.MAX_VALUE);
        result[1] = 0;
        
        Queue<Integer> q = new LinkedList<>();
        
        List<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < n+1; i++) {
            graph.add(new ArrayList<>());
        }
        // get(0) 의 리스트는 버리고 1부터 활용하면 됨!
        
        boolean[] visited = new boolean[n+1];
        
        for(int i = 0; i < edge.length; i++) {
            int node1 = edge[i][0];
            int node2 = edge[i][1];
            graph.get(node1).add(node2);
            graph.get(node2).add(node1);
        }
        
        // 1 - 2 3
        // 2 - 1 3 4 5
        int moveCnt = 0;
        q.offer(1);
        visited[1] = true;
        while(!q.isEmpty()) {
            int node = q.poll();
            moveCnt = result[node] + 1;
            List<Integer> g = graph.get(node);
            for(Integer N : g) {
                if(visited[N]) continue;
                q.offer(N);
                visited[N] = true;
                result[N] = Math.min(result[N], moveCnt);
            }
        }
        
        // 배열에서 최대값 찾기
        int max = 0;
        for(int i = 1; i < result.length; i++) {
            max = Math.max(result[i], max);
        }
        for(int i = 1; i < result.length; i++) {
            if(max == result[i]) answer++;
        }
        return answer;
    }
}