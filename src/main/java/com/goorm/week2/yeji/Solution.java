package com.goorm.week2.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 문자열 나누기 (46' 54")
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
        String array = br.readLine();

        return calculateScore(array, n);
    }

    static int calculateScore(String s, int n) {

        List<String> arrayList = new ArrayList<>();
        for (int i = 1; i < n - 1; i++) {
            String first = s.substring(0, i);
            arrayList.add(first);
            for (int j = i + 1; j < n; j++) {
                String second = s.substring(i, j);
                String third = s.substring(j);
                arrayList.add(second);
                arrayList.add(third);
            }
        }

        List<String> sortedArray = arrayList.stream().distinct().sorted().toList();
        int max = 0;
        for (int i = 1; i < n - 1; i++) {
            String first = s.substring(0, i);
            for (int j = i + 1; j < n; j++) {
                String second = s.substring(i, j);
                String third = s.substring(j);
                int compare = sortedArray.indexOf(first) + sortedArray.indexOf(second) + sortedArray.indexOf(third);
                max = Math.max(max, compare + 3);
            }
        }

        return max;
    }
}
