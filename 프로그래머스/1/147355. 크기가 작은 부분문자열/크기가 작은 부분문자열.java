class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        // String의 substring 메소드
        Long l2 = Long.parseLong(p);
        for(int i=0; i < t.length() - p.length() + 1; i++){
            String str = t.substring(i, i+p.length());
            Long l1 = Long.parseLong(str);
            if(l1 <= l2)
                answer += 1;
        }
        return answer;
    }
}