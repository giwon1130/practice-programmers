package org.example.Level0;

import java.util.Scanner;

//대소문자 바꿔서 출력하기
public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String input = sc.next();
        String input = "aBcDeFg";
        String output = "";
        char tmp;
        for(int i = 0; i<input.length(); i++){
            tmp = input.charAt(i);
            if((65 <= tmp) && (tmp<= 90)){
                output += input.valueOf(tmp).toLowerCase();
            }else if((97 <= tmp) && (tmp<= 122)){
                output += input.valueOf(tmp).toUpperCase();
            }else{
                output += (char)tmp;
            }
        }
        System.out.println(output);
    }
}