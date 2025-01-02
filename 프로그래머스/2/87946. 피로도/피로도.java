class Solution {  
    // 백트래킹 - 조건 하에 모든 경우 탐색
    static boolean[] visited;  
    static int count = 0;  
  
    public int solution(int k, int[][] dungeons) {  
        visited = new boolean[dungeons.length];  
        dfs(0, k, dungeons);  
        return count;
    }  
      
    private void dfs(int depth, int fatigue, int[][] dungeons){  
        for (int i = 0; i < dungeons.length; i++){  
            if (visited[i] || dungeons[i][0] > fatigue) {  // 방문했거나 현재피로도보다 높은 경우 다른 던전으로
                continue;  
            }  
            visited[i] = true;  
            dfs(depth + 1, fatigue - dungeons[i][1], dungeons);  
            visited[i] = false;  
        }  
        count = Math.max(count, depth);  
    }  
}