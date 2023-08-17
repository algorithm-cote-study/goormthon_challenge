package com.goorm.week1.day2.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 프로젝트 매니징
* Day : 23.08.15
* Solving time : 17:42 ~ 17:49
*/
public class Solution {
    private static final int HOUR = 24;
    private static final int MINUTE = 60;

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String solution(BufferedReader br) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int[] time = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int developTime = 0;
        for (int i = 0; i < N; i++) {
            developTime += Integer.parseInt(br.readLine());
        }
        int totalMinute = (time[1] + (developTime % MINUTE)) % MINUTE;
        int plusHour = (time[1] + (developTime % MINUTE)) / MINUTE;
        int totalHour = (time[0] + (developTime / MINUTE) + plusHour) % HOUR;
        return totalHour + " " + totalMinute;
    }
}