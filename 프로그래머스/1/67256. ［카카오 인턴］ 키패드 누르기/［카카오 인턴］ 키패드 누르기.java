import java.util.*;
class Solution {
    
    // 1 2 3
    // 4 5 6
    // 7 8 9
    // * 0 #
    static double[][] map = {{1,0}, {0,3}, {1,3},{2,3}, {0,2}, {1,2},{2,2}, {0,1}, {1,1},{2,1}, {0,0}, {2,0}};
    public String solution(int[] numbers, String hand) {
        boolean hands = hand.equals("right") ? true : false ; // false면 왼손, true면 오른손
        
        HashSet<Integer> hs_l = new HashSet<>(List.of(1,4,7));
        HashSet<Integer> hs_r = new HashSet<>(List.of(3,6,9));
        // System.out.println(hs_l.contains(3));
        int ex_l = 10; // 될 수 없는 초기값
        int ex_r = 11; // 될 수 없는 초기값
        
        StringBuilder sb = new StringBuilder();
        for(int number : numbers) {
            if(hs_l.contains(number)) {
                sb.append("L");
                ex_l = number;
            }
            else if (hs_r.contains(number)) {
                sb.append("R");
                ex_r = number;
            }
            else {
                // 이전 왼손 좌표 map[ex_l][0], map[ex_l][1]
                // 이전 오른손 좌표 map[ex_l][0], map[ex_l][1]
                // 신규 좌표 map[number][0], map[number][1]
                double dist1 = Math.abs(map[number][0] - map[ex_l][0]) + Math.abs(map[number][1] - map[ex_l][1]);
                double dist2 = Math.abs(map[number][0] - map[ex_r][0]) + Math.abs(map[number][1] - map[ex_r][1]);
                if(dist1 > dist2) {
                    sb.append("R");
                    ex_r = number;
                } else if (dist1 < dist2) {
                    sb.append("L");
                    ex_l = number;
                } else {
                    if(hands) {
                        sb.append("R");
                        ex_r = number;
                    } else {
                        sb.append("L");
                        ex_l = number;
                    }
                }
            }
        }

        return sb.toString();
    } 
}