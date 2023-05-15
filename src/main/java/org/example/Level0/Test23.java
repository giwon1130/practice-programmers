package org.example.Level0;

import java.util.Arrays;

// 마지막 두 원소
// 정수 리스트 num_list가 주어질 때, 마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을 마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가하여 return하도록 solution 함수를 완성해주세요.
public class Test23 {
    public static void main(String[] args) {
        solution(new int[]{2, 1, 6});
    }
    public static int[] solution(int[] num_list) {
        int[] answer = {};
        int s = num_list.length;
        // copyOf는 해당 길이 만큼 복사해오는데 없다면 해당 타입의 기본값으로 저장한다.
        num_list = Arrays.copyOf(num_list, s + 1);
        if(num_list[s-1] > num_list[s-2]){
            num_list[s] = num_list[s-1]-num_list[s-2];
        }else {
            num_list[s] = num_list[s-1] * 2;
        }
        return answer;
    }
}