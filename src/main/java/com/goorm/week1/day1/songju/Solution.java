package com.goorm.week1.day1.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 운동 중독 플레이어
 * Day : 23.08.15
 * Solving time : 17:25 ~ 17:35
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
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int W = input[0];
        int R = input[1];
        return (int) Math.floor(W + (W * R / 30));
    }
}