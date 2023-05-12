package org.example.Level1;

// 두 수의 합
// 정수 num1과 num2가 주어질 때, num1과 num2의 합을 return하도록 soltuion 함수를 완성해주세요.
public class Test01 {
    public static void main(String[] args) {
        solution(1,2);
    }
    public static int solution(int num1, int num2) {
        return num1+num2;
    }

//    public int solution(int num1, int num2) {
//        boolean val = (-50000<= num1 && num1<= 50000 && -50000<=num2 && num2 <= 50000);
//        int answer = -1;
//        if(val){
//            answer = num1 + num2;
//        }
//        return answer;
//    }
}