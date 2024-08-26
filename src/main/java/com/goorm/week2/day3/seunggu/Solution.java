package com.goorm.week2.day3.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    private static final int[] items = {14, 7, 1};

    public static void main(String[] args) throws Exception {
        // 17:18 ~ 17:24 6분 소요
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int answer = solution(reader);
            System.out.println(answer);
        }catch(IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader reader) throws IOException {
        int num = Integer.parseInt(reader.readLine());
        int answer = 0;
        for (int item : items) {
            while (num - item > -1) {
                answer++;
                num -= item;
            }
        }
        return answer;
    }
}
