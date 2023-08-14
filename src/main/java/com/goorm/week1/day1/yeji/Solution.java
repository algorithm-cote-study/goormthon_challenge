package com.goorm.week1.day1.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 운동 중독 플레이어 195683 (시뮬레이션 구현)
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
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int w = input[0];
        int r = input[1];

        return w + (w * r / 30);
    }

}
