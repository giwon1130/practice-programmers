package org.example.Level0;

// 문자열 돌리기
// 문자열 str이 주어집니다.
//문자열을 시계방향으로 90도 돌려서 아래 입출력 예와 같이 출력하는 코드를 작성해 보세요.
// abcde
//a
//b
//c
//d
//e
public class Test05 {
    public static void main(String[] args) {
        String a = "abcdef";
        char tmp;
        for(int i = 0 ; i< a.length() ; i++){
            tmp = a.charAt(i);
            System.out.println(tmp);
        }
    }
}