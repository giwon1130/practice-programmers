package org.example.Level0;

// 문자열 겹쳐쓰기
// 문자열 my_string, overwrite_string과 정수 s가 주어집니다.
// 문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을 문자열 overwrite_string으로 바꾼 문자열을 return
// 하는 solution 함수를 작성해 주세요.

// my_string와 overwrite_string은 숫자와 알파벳으로 이루어져 있습니다.
// 1 ≤ overwrite_string의 길이 ≤ my_string의 길이 ≤ 1,000
// 0 ≤ s ≤ my_string의 길이 - overwrite_string의 길이
public class Test07 {
    public static void main(String[] args) {
        solution("He11oWor1d","lloWorl",2);
    }

    private static String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        int osCnt = 0;
        for(int i = 0; i<my_string.length(); i++){
            if(i>=s && i< overwrite_string.length()+s){
                answer += overwrite_string.charAt(osCnt);
                osCnt++;
            }else{
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }

    // 다른사람풀의
//    public String solution(String my_string, String overwrite_string, int s) {
//        String before = my_string.substring(0, s);
//        String after = my_string.substring(s + overwrite_string.length());
//        return before + overwrite_string + after;
//    }
}