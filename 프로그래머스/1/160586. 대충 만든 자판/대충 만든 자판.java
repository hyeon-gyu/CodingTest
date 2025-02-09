import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        List<Integer> result = new ArrayList<>();
        // 최소한 = 전체 다 탐색
        // 해시맵에다가 단어와 최소 인덱스 번호를 저장
        HashMap<Character, Integer> hm = new HashMap<>();
        for(String key : keymap) {
            for(int j=0; j<key.length(); j++) {
                char c = key.charAt(j);
                hm.put(c, Math.min(hm.getOrDefault(c, Integer.MAX_VALUE), j+1));
            }
        }
        for (String target : targets) {
            int count = 0;
            for (char c : target.toCharArray()) {
                if (!hm.containsKey(c)) {
                    count = -1;
                    break;
                }
                count += hm.get(c);
            }
            result.add(count);
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}