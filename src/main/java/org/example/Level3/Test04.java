package org.example.Level3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// 코테 설명
public class Test04 {
    public static void main(String[] args) {
        solution(6,new int[]{46, 33, 33 ,22, 31, 50}, new int[]{7 ,56, 19, 14, 14, 10});
    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        List<String> arr1Binary = new ArrayList<>();
        List<String> arr2Binary = new ArrayList<>();

        // 배열 arr1을 2진법으로 변경, 이때 공백은 0으로 처리
        for (int i = 0; i < n; i++) {
            arr1Binary.add(String.format("%0"+n+"d", Integer.parseInt(Integer.toBinaryString(arr1[i]))));
            arr2Binary.add(String.format("%0"+n+"d", Integer.parseInt(Integer.toBinaryString(arr2[i]))));
        }

        // 이진법으로 변경된 두개의 배열을 합하여 0보다 클때 # 0일때 " " 으로 처리
        for (int i = 0; i < n; i++) {
            String sumArr = String.format("%0"+n+"d", Long.parseLong(arr1Binary.get(i)) + Long.parseLong(arr2Binary.get(i)));
            // 배열의 인덱스 별로 완성된 데이터 추가
            String temp = "";
            for(int j=0; j<n; j++) {
                if(sumArr.charAt(j)-'0' > 0){
                    temp += "#";
                }else {
                    temp += " ";
                }
            }
            answer[i] = temp;
        }

        return answer;
    }
}