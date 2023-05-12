package org.example.Level1;

// 두 수의 나눗셈
// 정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 soltuion 함수를 완성해주세요.
public class Test05 {
    public static void main(String[] args) {
        solution(1,16);
        System.out.println(solution(1,16));
    }

    public static int solution(int num1, int num2) {
        int answer = 0;
        double test = (num1*1.0/num2*1.0) * 1000;
        return (int) Math.floor(test);
    }
}