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
        int totalMinute = (time[1] + (developTime % 60)) % 60;
        int plusHour = (time[1] + (developTime % 60)) / 60;
        int totalHour = (time[0] + (developTime / 60) + plusHour) % 24;
        return totalHour + " " + totalMinute;
    }
}