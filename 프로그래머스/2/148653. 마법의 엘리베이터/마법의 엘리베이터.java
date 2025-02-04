class Solution {
    public int solution(int storey) {
        int cnt = 0;
        while (storey > 0) {
            int digit = storey % 10;
            int nextDigit = (storey / 10) % 10;

            if (digit < 5) {
                cnt += digit;
            } else if (digit > 5) {
                cnt += (10 - digit);
                storey += 10;
            } else { // digit == 5
                cnt += 5;
                if (nextDigit >= 5) {
                    storey += 10;
                }
            }
            storey /= 10;
        }
        return cnt;
    }
}
