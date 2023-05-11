package org.example.Level0;

// 홀짝 구분하기
//자연수 n이 입력으로 주어졌을 때 만약 n이 짝수이면 "n is even"을, 홀수이면 "n is odd."를 출력하는 코드를 작성해 보세요.
public class Test06 {
    public static void main(String[] args) {
        int n = 100;
//        int n = 101;
//        if(n%2==0){
//            System.out.println(n+" is even");
//        }else{
//            System.out.println(n+" is odd");
//        }
        System.out.print(n + " is "+(n % 2 == 0 ? "even" : "odd"));
    }
}