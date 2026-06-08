package com.goorm.week3.day1.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 통증(2)
 * Day : 23.08.28
 * Solving time : 18:30 ~ 18:45
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

    static int solution(BufferedReader br) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int[] items = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        int bigItemUseCnt = N / items[1];
        int result = -1;
        for (int i = bigItemUseCnt; i >= 0; i--) {
            int num = N - i * items[1];
            if (num % items[0] == 0) {
                result = i + num / items[0];
                break;
            }
        }
        return result;
    }
}