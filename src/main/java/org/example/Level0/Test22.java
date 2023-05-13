package org.example.Level0;

// 이어 붙인 수
// 정수가 담긴 리스트 num_list가 주어집니다. num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.
public class Test22 {
    public static void main(String[] args) {
        solution(new int[]{3, 4, 5, 2, 1});
    }
    public static int solution(int[] num_list) {
        int answer = 0;
        String odd = "";
        String even = "";
        for(int num : num_list){
            odd += (num%2 == 1) ? Integer.toString(num) : "";
            even += (num%2 == 0) ? Integer.toString(num) : "";
        }
        answer = Integer.parseInt(odd) + Integer.parseInt(even);
        return answer;
    }
}