package com.goorm.week1.day3.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 합 계산기 (195685)
 * 9'53" 10:04~10:13
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static int solution(BufferedReader br) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int answer = 0;
        for (int i = 0; i < n; i++) {
            String[] target = br.readLine().split(" ");
            answer += calculate(Integer.parseInt(target[0]), target[1], Integer.parseInt(target[2]));

        }

        return answer;
    }

    static int calculate(int num1, String operation, int num2) {
        if ("+".equals(operation)) {
            return num1 + num2;
        }

        if ("-".equals(operation)) {
            return num1 - num2;
        }

        if ("*".equals(operation)) {
            return num1 * num2;
        }

        return num1 / num2;
    }
}
