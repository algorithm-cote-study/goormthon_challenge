package com.goorm.week1.day2.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 프로젝트 매니징 (195684)
 */
public class Solution {

    private static final int MINUTES = 60;
    private static final int HOURS = 24;


    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String solution(BufferedReader br) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] time = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < n; i++) {
            time = makeFunctionTime(time, Integer.parseInt(br.readLine()));
        }

        return time[0] + " " + time[1];
    }

    private static int[] makeFunctionTime(int[] time, int processingTime) {
        int currentHour = time[0];
        int currentMinutes = time[1];

        int plusHour = (currentMinutes + processingTime) / MINUTES;
        int modMinutes = (currentMinutes + processingTime) % MINUTES;

        return new int[]{(currentHour + plusHour) % HOURS, modMinutes};
    }
}
