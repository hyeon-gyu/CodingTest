import java.util.*;

class Solution {
    public int solution(int[] arr) {
        // 최대 공약수 : 더 작은수를 하나 선정해서 0부터 작은수까지 큰 수를 나눠보고 나머지가 0인게 최대공약수로 결정
        // 최소 공배수 = 두 수의 곱 / 최대공약수
        int n; // 최대공약수 임시변수
        int m; // 최소 공배수 임시변수
        if(arr.length == 1) {
            return arr[0];
        }
        Arrays.sort(arr);        
        // 1,2번 원소로 최소공배수 먼저 구하기
        n = calc(arr[0], arr[1]);
        m = (arr[0] * arr[1]) / n;
        for(int i=2; i<arr.length; i++) {
            // 다음 수랑 이전 최소 공배수랑 최대공약수 구하고 또 최소공배수 구하기
            n = calc(m, arr[i]);
            m = (m * arr[i]) / n;
            System.out.println(m);
        }
        // System.out.println(m);
        return m;
    }
    
    // 최대공약수 계산 함수
    private int calc(int a, int b) {
        for(int i=a; i>0; i--) {
            if(a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }
}