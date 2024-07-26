import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Set<Integer> reserveSet = new HashSet<>();
        Set<Integer> lostSet = new HashSet<>();
        for (int r : reserve) {
            reserveSet.add(r);
        }
        for (int l : lost) {
            lostSet.add(l);
        }
        for (Iterator<Integer> it = lostSet.iterator(); it.hasNext();) {
            int k = it.next();
            if (reserveSet.contains(k)) {
                reserveSet.remove(k);
                it.remove();
            }
        }

        int answer = n - lostSet.size();
        for (int l : lostSet) {
            if (reserveSet.contains(l - 1)) {
                reserveSet.remove(l - 1);
                answer++;
            } else if (reserveSet.contains(l + 1)) {
                reserveSet.remove(l + 1);
                answer++;
            }
        }

        return answer;
    }
}