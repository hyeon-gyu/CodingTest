import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        
        // Map으로 정현이가 원하는 제품과 수량 저장
        Map<String, Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }

        int result = 0;

        // 10일 간격으로 할인 목록을 확인
        for (int i = 0; i <= discount.length - 10; i++) {
            Map<String, Integer> discountMap = new HashMap<>();

            // 현재 10일 동안의 할인 제품을 카운팅
            for (int j = i; j < i + 10; j++) {
                discountMap.put(discount[j], discountMap.getOrDefault(discount[j], 0) + 1);
            }

            // 할인 제품이 원하는 제품과 수량이 일치하는지 확인
            boolean valid = true;
            for (String key : wantMap.keySet()) {
                if (discountMap.getOrDefault(key, 0) < wantMap.get(key)) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                result++;
            }
        }

        return result;
    }
}