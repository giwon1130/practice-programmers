package org.example.Level0;

// 문자열 섞기
// 길이가 같은 두 문자열 str1과 str2가 주어집니다.
//
//두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성해 주세요.
public class Test08 {
    public static void main(String[] args) {
        solution("aaaaa","bbbbb");
    }
    public static String solution(String str1, String str2) {
        String answer = "";
        char[] str1Char = str1.toCharArray();
        char[] str2Char = str2.toCharArray();

        if(str1Char.length == str2Char.length){
            for (int i = 0; i < str1Char.length; i++) {
                    answer += str1Char[i];
                    answer += str2Char[i];
            }

        }
        return answer;
    }
}