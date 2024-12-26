class Solution {
    
    int count = 0;
    int answer = 0;
    public int solution(String word) {
        dfs(new StringBuilder(), word);
        return count;
    }
    
    private boolean dfs(StringBuilder sb, String word) {
        
        if(sb.toString().equals(word)) {return true;}
        if(sb.length() >= 5) {return false;}
        
        for(Character c : "AEIOU".toCharArray()) {
            sb.append(c);
            count ++;
            if(dfs(sb, word)) {
                answer = count;
                return true;
            }
            sb.deleteCharAt(sb.length() -1);
        }
        return false;
    }
}