class Solution {
    public String solution(String s) {
        // 공백 이후 첫글자는 대문자로
        StringBuffer sb = new StringBuffer();
        boolean flag = true;
        for(Character c : s.toCharArray()){
            if(c == ' '){
                flag = true;
            }
            if(c != ' ' && flag == true){
                sb.append(Character.toUpperCase(c));
                flag = false;
            }
            else{
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }
}