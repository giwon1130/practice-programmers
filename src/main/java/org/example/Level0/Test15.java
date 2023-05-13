package org.example.Level0;

// 홀짝에 따라 다른 값 반환하기
// 양의 정수 n이 매개변수로 주어질 때, n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return 하고 n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return 하는 solution 함수를 작성해 주세요.
public class Test15 {
    public static void main(String[] args) {
        solution(7);
    }
    public static int solution(int n) {
        int answer = 0;
        if(n%2==0){
            // 짝수일때
            for (int i = 0; i <= n; i+=2) {
                answer += i*i;
            }
        }else{
            // 홀수일때
            for (int i = 1; i <= n; i+=2) {
                answer += i;
            }
        }
        System.out.println(answer);
        return answer;
    }
}