import java.util.*;

class Solution {
    
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {

        Map<String, Integer> map = new HashMap<>();
        map.put("code", 0);
        map.put("date", 1);
        map.put("maximum", 2);
        map.put("remain", 3);
        Queue<int[]> q = new PriorityQueue<>( (o1, o2) -> o1[map.get(sort_by)] - o2[map.get(sort_by)]);
        
        int idx = map.get(ext);
        for(int[] info : data) {
            if(info[idx] < val_ext) {
                q.offer(info);
            }
        }
        int[][] answer = new int[q.size()][4];
        int k = 0;
        while(!q.isEmpty()) {
            int[] r = q.poll();
            for(int i = 0; i < r.length; i++) {
                answer[k][i] = r[i];
            }
            k++;
        }
        return answer;
    }
}