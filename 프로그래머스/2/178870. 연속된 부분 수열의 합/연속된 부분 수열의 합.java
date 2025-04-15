class Solution {
    public int[] solution(int[] sequence, int k) {
        int n = sequence.length;
        int start = 0, end = 0, sum = 0;
        int minLen = Integer.MAX_VALUE;
        int[] answer = new int[2];

        while (true) {
            if (sum >= k) {
                if (sum == k) {
                    int len = end - start;
                    if (len < minLen) {
                        minLen = len;
                        answer[0] = start;
                        answer[1] = end - 1;
                    }
                }
                sum -= sequence[start++];
            } else {
                if (end == n) break;
                sum += sequence[end++];
            }
        }

        return answer;
    }
}
