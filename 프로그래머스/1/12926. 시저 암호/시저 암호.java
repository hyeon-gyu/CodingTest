class Solution {
    public String solution(String s, int n) {
        char[] arr = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        for(int i=0; i< arr.length; i++){
            if(Character.isLowerCase(arr[i])){
                sb.append((char)((arr[i] - 'a' + n) % 26 + 'a'));
            }
            else if ( Character.isUpperCase(arr[i])){
                sb.append((char)((arr[i] - 'A' + n) % 26 + 'A'));                   
            }
            else{
                sb.append(' ');    
            }

        }
        return sb.toString();
    }
}