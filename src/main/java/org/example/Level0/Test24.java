package org.example.Level0;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// 수 조작하기 1
// 정수 n과 문자열 control이 주어집니다. control은 "w", "a", "s", "d"의 4개의 문자로 이루어져 있으며, control의 앞에서부터 순서대로 문자에 따라 n의 값을 바꿉니다.
//
//"w" : n이 1 커집니다.
//"s" : n이 1 작아집니다.
//"d" : n이 10 커집니다.
//"a" : n이 10 작아집니다.
//위 규칙에 따라 n을 바꿨을 때 가장 마지막에 나오는 n의 값을 return 하는 solution 함수를 완성해 주세요.
public class Test24 {
    public static void main(String[] args) {
        solution(0, "wsdawsdassw");
    }
    public static int solution(int n, String control) {
        int answer = 0;
        String[] resultArray = control.split("");

        int wCnt = Collections.frequency(List.of(resultArray),"w");
        int sCnt = Collections.frequency(List.of(resultArray),"s");
        int dCnt = Collections.frequency(List.of(resultArray),"d");
        int aCnt = Collections.frequency(List.of(resultArray),"a");



        return (wCnt) - (sCnt) + (dCnt*10) - (aCnt*10);
    }

}