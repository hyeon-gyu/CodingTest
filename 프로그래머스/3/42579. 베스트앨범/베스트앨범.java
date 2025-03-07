import java.util.*;
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        
        // 속한 노래가 많이 재생된 장르 먼저 수록
        // 장르 내에서 많이 재생된 노래 먼저
        // 재생횟수가 같으면 고유번호가 낮은 노래 먼저 수록
        // 장르별 두개씩
        
        //PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o2[1] - o1[1]); // 재생횟수로 내림차순 
        
        // 1. 장르별 총 재생 횟수를 저장하는 Map
        Map<String, Integer> genreTotalPlays = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            genreTotalPlays.put(genres[i], genreTotalPlays.getOrDefault(genres[i], 0) + plays[i]);
        }

        // pop : 1번 600, 4번 2500
        // 2. 장르별 노래 정보를 저장하는 Map (PriorityQueue 사용)
        Map<String, PriorityQueue<int[]>> genreSongs = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            genreSongs.computeIfAbsent(genres[i], k -> new PriorityQueue<>((a, b) -> {
                if (a[1] != b[1]) {
                    return b[1] - a[1]; // 재생 횟수 내림차순
                } else {
                    return a[0] - b[0]; // 고유 번호 오름차순
                }
            })).offer(new int[]{i, plays[i]});
        }
        
        // 3. 재생 횟수가 많은 장르부터 선택하여 결과 생성
        List<Integer> result = new ArrayList<>();
        List<String> sortedGenres = new ArrayList<>(genreTotalPlays.keySet());
        sortedGenres.sort((a, b) -> genreTotalPlays.get(b) - genreTotalPlays.get(a)); // 총 재생 횟수 내림차순으로 장르 정렬

        for (String genre : sortedGenres) {
            PriorityQueue<int[]> pq = genreSongs.get(genre);
            int count = 0;
            while (!pq.isEmpty() && count < 2) {
                result.add(pq.poll()[0]); // 고유 번호 저장
                count++;
            }
        }

        // 4. 결과를 int[] 배열로 변환
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;        
    }
}