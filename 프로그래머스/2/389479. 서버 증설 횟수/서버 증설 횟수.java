class Solution {
    public int solution(int[] players, int m, int k) {
        int answer = 0;
        
        // m 명 당 서버 한 대씩 증설 -> 이용자 수 / m 명 몫 개수만큼 서버 필요
        // 증설한 서버는 k 시간 뒤에 사라짐
        // 서버가 언제 종료되는지 추적하고 있어야함
        //현재 서버가 몇대인지 알고 있어야 이용자가 더 늘어도 증설할지말지 결정
        
        int[] server = new int[players.length]; // 서버 증설 시작한 시간 인덱스 -> 요소는 증설 서버 개수
        // 0시간에 2개, 1시간에 4개 ... 7시간에 2개
        for(int time = 0; time < players.length; time++) {
            // System.out.println(player / m);
            int player = players[time];
            int needServerCnt = player / m; // 증설 서버 개수 파악
            if(needServerCnt == 0) continue; // 서버 증설이 필요없는 경우
            
            int existServerCnt = 0; // 현재 시간 기준, time-k부터 time까지 살아있는 서버 개수
            int startTime = Math.max(0, time -k + 1);
            for(int i = startTime; i < time; i++) {
                existServerCnt += server[i];
            }
            
            if (existServerCnt < needServerCnt) {
                int add = needServerCnt - existServerCnt;
                answer += add;
                server[time] = add;
            }
        }
        
        return answer;
    }
}