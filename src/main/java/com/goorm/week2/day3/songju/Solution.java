package com.goorm.week2.day3.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 통증
 * Day : 23.08.23
 * Solving time : 18:22 ~ 18:28
 */
public class Solution {
    private static final int[] items = {14, 7, 1};

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int solution(BufferedReader br) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int result = 0;
        for (int i = 0; i < items.length; i++) {
            result += N / items[i];
            N %= items[i];
            if (N == 0) break;
        }
        return result;
    }
}