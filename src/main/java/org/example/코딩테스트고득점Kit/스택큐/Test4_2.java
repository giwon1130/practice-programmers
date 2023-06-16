package org.example.코딩테스트고득점Kit.스택큐;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// 코테 설명
// 주식가격
public class Test4_2 {

    public static void main(String[] args) {
        solution(new int[]{1, 2, 3, 2, 3});
    }

    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = prices.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && prices[i] <= prices[stack.peek()]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                answer[i] = prices.length - i - 1;
            } else {
                answer[i] = stack.peek() - i;
            }

            stack.push(i);
        }

        return answer;
    }
}