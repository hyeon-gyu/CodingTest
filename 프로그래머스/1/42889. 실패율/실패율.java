import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        
        Arrays.sort(stages);
        int len = stages.length;
        
        // 각 스테이지별 도달한 사람 수, 클리어하지 못한 사람 수
        Map<Integer, Integer> challenger = new HashMap<>(); // 도전한 사람 수
        Map<Integer, Integer> stuck = new HashMap<>();      // 실패한 사람 수

        for (int stage = 1; stage <= N; stage++) {
            challenger.put(stage, 0);
            stuck.put(stage, 0);
        }

        for (int i = 0; i < len; i++) {
            int s = stages[i];
            for (int stage = 1; stage <= Math.min(s, N); stage++) {
                challenger.put(stage, challenger.get(stage) + 1);
            }
            if (s <= N) { // N+1은 "모두 클리어한 사람"이므로 제외
                stuck.put(s, stuck.get(s) + 1);
            }
        }

        // 실패율 저장용 pq (내림차순 → 큰 실패율 먼저)
        PriorityQueue<double[]> pq = new PriorityQueue<>((o1, o2) -> {
            if (Double.compare(o2[1], o1[1]) != 0) {
                return Double.compare(o2[1], o1[1]); // 실패율 내림차순
            } else {
                return Integer.compare((int) o1[0], (int) o2[0]); // 실패율 같으면 스테이지 번호 오름차순
            }
        });

        for (int stage = 1; stage <= N; stage++) {
            int stuckCnt = stuck.get(stage);
            int challengerCnt = challenger.get(stage);

            double failRate = 0.0;
            if (challengerCnt != 0) {
                failRate = (double) stuckCnt / challengerCnt;
            }
            pq.offer(new double[] {stage, failRate});
        }

        // 결과 뽑기
        int idx = 0;
        while (!pq.isEmpty()) {
            double[] cur = pq.poll();
            answer[idx++] = (int) cur[0];
        }

        return answer;
    }
}
