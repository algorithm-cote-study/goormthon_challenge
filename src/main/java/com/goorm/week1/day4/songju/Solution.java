package com.goorm.week1.day4.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 완벽한 햄버거 만들기
 * Day : 23.08.17
 * Solving time : 18:25 ~ 18:34
 */
public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int solution(BufferedReader br) throws IOException {
        int sum = 0;
        int N = Integer.parseInt(br.readLine());
        int [] flavor = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean orderFlag = false; //false asc true desc
        for (int i = 0; i < N-1; i++) {
            if(!orderFlag && flavor[i] <= flavor[i+1]){
                sum+=flavor[i];
            } else {
                orderFlag = true;
                if(flavor[i] >= flavor[i+1]){
                    sum+=flavor[i];
                } else {
                    return 0;
                }
            }
        }
        sum +=flavor[N-1];
        return sum;
    }
}