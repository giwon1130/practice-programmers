package org.example.Level1;

// 두 수의 차
// 정수 num1과 num2가 주어질 때, num1에서 num2를 뺀 값을 return하도록 soltuion 함수를 완성해주세요.
public class Test02 {
    public static void main(String[] args) {
        solution(90,89);
    }
    public static int solution(int num1, int num2) {
        int answer = -1;
        if(-50000 <= num1 && num1 <= 50000 && -50000 <= num2 && num2 <= 50000){
            answer = num1 - num2;
        }
        return answer;
    }
}