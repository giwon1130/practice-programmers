package org.example.백준;

import java.util.Stack;

// 코테 설명
// 프로그래머스 괄호 회전하기
// 다음 규칙을 지키는 문자열을 올바른 괄호 문자열이라고 정의합니다.
//
//(), [], {} 는 모두 올바른 괄호 문자열입니다.
//만약 A가 올바른 괄호 문자열이라면, (A), [A], {A} 도 올바른 괄호 문자열입니다. 예를 들어, [] 가 올바른 괄호 문자열이므로, ([]) 도 올바른 괄호 문자열입니다.
//만약 A, B가 올바른 괄호 문자열이라면, AB 도 올바른 괄호 문자열입니다. 예를 들어, {} 와 ([]) 가 올바른 괄호 문자열이므로, {}([]) 도 올바른 괄호 문자열입니다.
//대괄호, 중괄호, 그리고 소괄호로 이루어진 문자열 s가 매개변수로 주어집니다. 이 s를 왼쪽으로 x (0 ≤ x < (s의 길이)) 칸만큼 회전시켰을 때 s가 올바른 괄호 문자열이 되게 하는 x의 개수를 return 하도록 solution 함수를 완성해주세요.
public class Sample3 {

    // 스택 자료구조 활용
    public int solution(String s) {
        int answer = 0;

        // for문을 돌면서 문자열 회전
        for (int i = 0; i < s.length(); i++) {
            s = s.substring(1) + s.charAt(0);
            if(checkValidParentheses(s)){
                answer++;
            }

        }
        return answer;
    }

    // 올바른 괄호 문자열인지 검사하는 메소드
    private boolean checkValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if(isOpenParenthese(c)){ // 여는 괄호인 경우 스택에 삽입
                stack.push(c);
            } else { // 닫는 괄호인 경우 스택에서 맨 위의 요소와 짝을 검사
                if(stack.empty() || !isPair(stack.peek(), c)){
                    return false; // 짝이 맞지 않으면 false 반환
                }
                stack.pop(); // 짝이 맞으면 스택에서 요소 제거
            }
        }
        return stack.isEmpty(); // 스택이 비어있으면 true, 아니면 false 반환
    }

    // 짝이 맞는지 확인하는 메서드
    private boolean isPair(Character open, char close) {
        if((open == '(' && close == ')') || (open == '[' && close == ']') || (open == '{' && close == '}')){
            return true;
        }else {
            return false;
        }
    }

    // 여는 괄호인지 확인하는 메서드
    private boolean isOpenParenthese(char c) {
        if (c == '(' || c == '[' || c == '{'){
            return true;
        }else {
            return false;
        }
    }
}