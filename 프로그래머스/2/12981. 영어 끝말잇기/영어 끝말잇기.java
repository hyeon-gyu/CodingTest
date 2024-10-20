import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int turn = 0; // 회차
        int index = 0;  // 한 회차에 순번
        Map<String, Integer> map = new HashMap<>();
        
        // 첫 단어 등록
        map.put(words[0], 1);
        for (int i = 1; i < words.length; i++) {
            // 어느 회차인지, 어느 순번인지 계산
            turn = i / n;
            index = i % n;
            // 중복 단어 체크
            if (map.get(words[i]) != null) {
                return new int[] {index + 1, turn + 1};
            }
            
            // 끝말잇기 규칙 위반 체크
            if (words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0)) {
                return new int[] {index + 1, turn + 1};
            }
            
            // 단어 등록
            map.put(words[i], 1);
        }

        // 모든 규칙을 통과한 경우 (0, 0) 반환
        return new int[] {0, 0};
    }
}
