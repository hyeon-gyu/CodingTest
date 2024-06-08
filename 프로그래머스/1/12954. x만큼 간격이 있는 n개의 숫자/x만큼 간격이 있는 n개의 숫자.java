class Solution {
    public long[] solution(long x, int n) {
        long[] arr = new long[n];

        for (int i = 1; i <= n; i++) {
            arr[i-1] = x * i;
        }

        return arr;
    }
}