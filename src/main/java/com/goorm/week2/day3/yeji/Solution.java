package com.goorm.week2.day3.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 통증 (195690)
 * 35' 16"
 */
public class Solution {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader br) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] items = {14, 7};
        int answer = 0;

        for (int item : items) {
            answer += Math.floorDiv(n, item);
            n = Math.floorMod(n, item);
        }

        return answer + n;
    }

}
