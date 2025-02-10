class Solution {
    public int[] solution(String[] wallpaper) {
        // 최소한의 이동거리 구하기
        // 끝에 있을 것으로 추정되는 좌표에서 x,y에 +1씩 해야함!
        
        // 가장 적은 x좌표와 가작 적은 y좌표를 먼저 구하자
        int minx = Integer.MAX_VALUE;
        int miny = Integer.MAX_VALUE;
        int maxx = 0;
        int maxy = 0;
        
        for(int i=0; i<wallpaper.length; i++) {
            for(int j=0; j<wallpaper[i].length(); j++) {
                if(wallpaper[i].charAt(j) == '#') {
                    minx = Math.min(minx, j);
                    miny = Math.min(miny, i);
                    maxx = Math.max(maxx, j+1);
                    maxy = Math.max(maxy, i+1);
                }
            }
        }
        int[] answer = {miny, minx, maxy, maxx};
        return answer;
    }
}