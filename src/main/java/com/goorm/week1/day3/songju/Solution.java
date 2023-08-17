package com.goorm.week1.day3.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 합 계산기
 * Day : 23.08.16
 * Solving time : 18:26 ~ 18:33
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
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int num1 = Integer.parseInt(st.nextToken());
            String op = st.nextToken();
            int num2 = Integer.parseInt(st.nextToken());
            switch (op) {
                case "+" -> sum += (num1 + num2);
                case "-" -> sum += (num1 - num2);
                case "*" -> sum += (num1 * num2);
                case "/" -> sum += (int) Math.floor(num1 / num2);
            }
        }
        return sum;
    }
}