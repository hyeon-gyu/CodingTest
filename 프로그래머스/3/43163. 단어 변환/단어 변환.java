import java.util.*;
class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        int len = begin.length(); // 길이 계산
        // words 안에 있는 단어인지 검사 + 한 개의 알파멧만 변환된건지 검사
        // BFS -> 한글자씩 바뀐 글자만 탐색 + dup 업데이트 -> 한글자씩 바뀐 글자 탐색
        HashSet<String> visited = new HashSet<>();
        Queue<String> q = new LinkedList<>();

        q.offer(begin);
        visited.add(begin);

        while(!q.isEmpty()) {
            int size = q.size();
            for(int i=0; i<size; i++) {
                String word = q.poll();
                if(word.equals(target)) {
                    return answer;
                }
                for(String w : words) {
                    if(visited.contains(w)) {continue;}
                    int diff = 0;
                    for(int j=0; j<len; j++) {
                        if (word.charAt(j) != w.charAt(j) ) { 
                            diff++;
                        }
                    }
                    if(diff==1) {             
                        q.offer(w);
                        visited.add(w); // 활용한 단어면 hashSet에 저장
                    }
                }
            }
            answer++;
        }
        
        return 0;
    }
}