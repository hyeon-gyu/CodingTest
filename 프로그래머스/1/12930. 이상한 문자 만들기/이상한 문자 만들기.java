class Solution {
    public String solution(String s) {
        StringBuffer sb = new StringBuffer();
        char[] arr = s.toCharArray();
        int j = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == ' '){
                j = 0;
                sb.append(' ');
                continue;
            }
            sb.append( j % 2 == 0 ? Character.toUpperCase(arr[i]) : Character.toLowerCase(arr[i]));
            j++;
        }
        return sb.toString();
    }
}