package org.example.코딩테스트고득점Kit.스택큐;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// 코테 설명
// 기능개발
public class Test2 {

    public static void main(String[] args) {
        solution(new int[]{93, 30, 55}, new int[]{1, 30, 5});
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        // 기능이 완성되는 일수를 구한다.(100프로가 완성이니깐 (100 - 현재진행률)/speeds)의 소수점 올림 2.5면 3
        // 스택에 가장 후순위 기능부터 넣는다.
        // 스택의 가장 위에 있는 값을 꺼내어 나머지 값을 while로 비교하며 더 먼저 끝내는 기능을 카운트한다.
        // List에 카운트값을 넣는다.
        // List값에 배포순서대로 배포가능 기능 숫자가 적재된다.
        // 결과 배열에 값을 넣는다.
        Stack<Integer> stack = new Stack<>();
        List<Integer> deployCounts = new ArrayList<>();

        for (int i = progresses.length - 1; i >= 0; i--) {
            int remainingDays = (int) Math.ceil((double) (100 - progresses[i]) / speeds[i]);
            stack.push(remainingDays);
        }

        while (!stack.isEmpty()){
            int top = stack.pop();
            int count = 1;

            // 현재 기능보다 뒤에 있는 기능 중 진도가 빠른 기능 찾기
            while (!stack.isEmpty() && stack.peek() <= top) {
                stack.pop();
                count++;
            }

            deployCounts.add(count);
        }

        // 결과 배열 생성
        int[] answer = new int[deployCounts.size()];
        for (int i = 0; i < deployCounts.size(); i++) {
            answer[i] = deployCounts.get(i);
        }
        return answer;
    }
}