package org.example.Level0;

// 공배수
// 정수 number와 n, m이 주어집니다. number가 n의 배수이면서 m의 배수이면 1을 아니라면 0을 return하도록 solution 함수를 완성해주세요.
public class Test14 {
    public static void main(String[] args) {
        solution(100, 10,3);
    }
    public static int solution(int number, int n, int m) {
        int answer = 0;
        if(number%n == 0 && number%m == 0){
            answer = 1;
        }
        return answer;
    }
}