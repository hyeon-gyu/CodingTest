import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        
        int n = record.length;
        
        List<String[]> answer = new ArrayList<>();
        
        Map<String, String> hm = new HashMap<>();
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            String[] info = record[i].split(" ");
            String command = info[0];
            
            switch(command) {
                case "Enter" :
                    hm.put(info[1], info[2]); // 1234유저가 나가서 이름 바꾸고 다시 들어오면 hm 새로 업데이트
                    
                    answer.add(new String[]{info[1], "님이 들어왔습니다."});
                    cnt++;
                    break;
                case "Leave" :
                    answer.add(new String[]{info[1], "님이 나갔습니다."});
                    cnt++;
                    break;
                case "Change" :
                    hm.put(info[1], info[2]);
                    break;
            }
        }
        
        String[] result = new String[cnt];
        for(int i = 0; i < cnt; i++) {
            String name = hm.get(answer.get(i)[0]);
            String action = answer.get(i)[1];
            result[i] = name + action;
        }
        return result;
    }
}