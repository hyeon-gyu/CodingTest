import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        
        // 내림차순으로 정렬
        Integer[] sortedA = Arrays.stream(A).boxed().toArray(Integer[]::new);
        Integer[] sortedB = Arrays.stream(B).boxed().toArray(Integer[]::new);
        Arrays.sort(sortedA, Collections.reverseOrder());
        Arrays.sort(sortedB, Collections.reverseOrder());
        
        Queue<Integer> queueA = new LinkedList<>(Arrays.asList(sortedA));
        Queue<Integer> queueB = new LinkedList<>(Arrays.asList(sortedB));
        
        while (!queueA.isEmpty()) {
            int a = queueA.poll();
            int b = queueB.peek();
            
            if (b > a) {
                answer++;
                queueB.poll();
            }
        }
        
        return answer;
    }
}
