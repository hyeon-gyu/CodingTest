class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int tmp = 0; // 가진 콜라 개수
        // n을 a로 나눈 몫 * b만큼 콜라를 받는다. -> n- 마트에 주지않은 병 개수도 더해야 현재 가진 콜라수가 된다.
        // 몫 + n-몫 개수를 n으로 업데이트하고 또 같은 과정 반복

        while(n / a > 0){
            tmp = (n / a) * b;
            n = tmp + n%a;
            answer += tmp;
        }
        
        return answer;
    }
}