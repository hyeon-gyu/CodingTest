import java.util.*;
class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<n; i++) {
            if(visited[i]) continue;
            answer++;
            q.offer(i);
            visited[i] = true;
            while(!q.isEmpty()) {
                int k = q.poll();
                // System.out.println(k);
                for(int j=0; j<n; j++) {
                    if(!visited[j] && computers[k][j] == 1) {
                        q.offer(j);
                        visited[j] = true;
                    }
                }
            }
        }
        return answer;
    }
}