package org.example.백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 코테 설명
public class Sample {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer =
                new StringTokenizer(bufferedReader.readLine());
        int suNo = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());
        long[] sum = new long[suNo+1];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 1; i <= suNo; i++) {
            sum[i] = sum[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }
        for (int i = 0; i < quizNo; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int j  = Integer.parseInt(stringTokenizer.nextToken());
            int k = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(sum[k] - sum[j-1]);
        }
    }
}