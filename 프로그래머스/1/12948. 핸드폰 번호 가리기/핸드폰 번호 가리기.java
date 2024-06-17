class Solution {
    public String solution(String phone_number) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int leng = phone_number.length();
        String num = phone_number.substring(leng-4, leng);
        for (int i = 0; i < leng - 4; i++) {
            sb.append("*");
        }
        sb.append(num);
        return sb.toString();
    }
}