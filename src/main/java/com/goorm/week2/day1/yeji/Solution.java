package com.goorm.week2.day1.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * 문자열 나누기 (195688)
 * 46' 54"
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

        Set<String> uniqueSubString = new TreeSet<>();
        for (int i = 1; i < n - 1; i++) {
            uniqueSubString.add(s.substring(0, i));
            for (int j = i + 1; j < n; j++) {
                uniqueSubString.add(s.substring(i, j));
                uniqueSubString.add(s.substring(j));
            }
        }

        List<String> sortedUniqueSubStrings = uniqueSubString.stream().toList();
        int max = 0;
        for (int i = 1; i < n - 1; i++) {
            String first = s.substring(0, i);
            for (int j = i + 1; j < n; j++) {
                String second = s.substring(i, j);
                String third = s.substring(j);
                int compare = sortedUniqueSubStrings.indexOf(first) + sortedUniqueSubStrings.indexOf(second) + sortedUniqueSubStrings.indexOf(third);
                max = Math.max(max, compare);
            }
        }

        return max + 3;
    }
}
