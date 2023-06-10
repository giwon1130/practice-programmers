package org.example.Level3;

import java.util.*;

// 코테 설명
public class Test07 {
    public static void main(String[] args) {
        solution(3, new int[]{40,80,60});
    }

    public static String solution(int N, int[] arr) {
        String answer = "";
        int A[] = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = arr[i];
        }
        long sum = 0;
        long max = 0;
        for (int i = 0; i < N; i++) {
            sum = sum + A[i];
            max = max < A[i] ? A[i] : max;
        }

        System.out.println(sum * 100.0 / max / N);

        return answer;
    }

}