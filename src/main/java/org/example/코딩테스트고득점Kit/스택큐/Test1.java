package org.example.코딩테스트고득점Kit.스택큐;

import java.util.Stack;

// 코테 설명
// 같은 숫자는 싫어
public class Test1 {

    public static void main(String[] args) {
        solution(new int[]{1,1,3,3,0,1,1});
    }

    public static int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        for(int num : arr){
            if(stack.isEmpty() || stack.peek() != num){
                stack.push(num);
            }
        }
        int[] answer = new int[stack.size()];
        int index = stack.size() - 1;
        while(!stack.isEmpty()){
            answer[index] = stack.pop();
            index--;
        }
        return answer;
    }
}