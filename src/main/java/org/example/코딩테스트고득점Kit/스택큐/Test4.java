package org.example.코딩테스트고득점Kit.스택큐;

import java.util.*;

// 코테 설명
// 주식가격
public class Test4 {

    public static void main(String[] args) {
        solution(new int[]{1, 2, 3, 2, 3});
    }

    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < prices.length; i++){
            stack.push(prices[prices.length -1 -i]);
            list.add(prices[i]);
        }
        int stackSize = stack.size();
        for (int i = 0; i < stackSize; i++) {
            int temp = stack.pop();
            for (int j = i; j < stackSize-1; j++) {
                if(temp <= list.get(j+1)){ // 가격이 안떨어짐
                    answer[i] += 1;
                };
            }
        }
        System.out.println(answer);
        return answer;
    }
}