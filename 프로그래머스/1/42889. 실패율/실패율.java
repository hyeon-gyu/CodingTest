import java.util.*;

class Info {
    int index;
    double percent;
        
    public Info(int idx, double p) {
        this.index=idx;
        this.percent = p;
    }
}

class Solution {

    
    public int[] solution(int N, int[] stages) {

        int[] count = new int[N + 2]; // count[i] = i번 스테이지에 있는 사람 수
        for (int s : stages) {
            count[s]++;
        }
        int total = stages.length;
        
        PriorityQueue<Info> pq = new PriorityQueue<>( (o1, o2) -> {
            if(o2.percent == o1.percent) {
                return o1.index - o2.index;
            } else {
                return Double.compare(o2.percent, o1.percent);
            }
        });
        
        for (int i = 1; i <= N; i++) {
            if (total == 0) {
                pq.offer(new Info(i, 0));
            } else {
                double failRate = (double) count[i] / total;
                pq.offer(new Info(i, failRate));
                total -= count[i];
            }
        }
        
        List<Integer> arr = new ArrayList<>();
        while(!pq.isEmpty()) {
            Info i = pq.poll();
            arr.add(i.index);
        }
        
        return arr.stream().mapToInt(i->i).toArray();
    }
}