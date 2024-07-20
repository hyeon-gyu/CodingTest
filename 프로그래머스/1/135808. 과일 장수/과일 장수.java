import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        // k : 사과의 최대점수 , m : 상자 당 사과 개수
        // score 내림차순 정렬해서 루프 돌면서 m개씩 묶을까 -> 최소값 계속 업데이트하면서 m개 채워지면 answer에 더하기
        Integer[] arr = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());
        int count = 0;
        int min = k;
        for(int num : arr){
            count += 1;
            if(min > num){
                min = num;
            }
            if(count == m){
                answer += min * m;
                count = 0;
                min = k;
            }
        }
        return answer;
    }
}