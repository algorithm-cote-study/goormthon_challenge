package com.goorm.week2.day1.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

/* 문자열 나누기
 * Day : 23.08.21
 * Solving time : 19:40 ~ 20:20
 */
public class Solution {
    private static ArrayList<String[]> strList;
    private static TreeSet<String> orderStrList;
    private static final int SPLIT_NUM = 3;

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int solution(BufferedReader br) throws IOException {
        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();
        int result = Integer.MIN_VALUE;
        splitString(N, S);
        for (String[] list : strList) {
            int sum = 0;
            int idx = 0;
            for (String orderStr : orderStrList) {
                idx++;
                long cnt = Arrays.stream(list).filter(a -> a.equals(orderStr)).count();
                if (cnt > 0)
                    sum += cnt * idx;
            }
            result = Math.max(result, sum);
        }
        return result;
    }

    public static void splitString(int n, String s) {
        strList = new ArrayList<>();
        orderStrList = new TreeSet<>(); //중복제거 및 오름차순 정렬을 제공하는 데이터형
        for (int i = 1; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                String[] splitStr = new String[SPLIT_NUM];
                splitStr[0] = s.substring(0, i);
                splitStr[1] = s.substring(i, j);
                splitStr[2] = s.substring(j);
                strList.add(splitStr);
                orderStrList.addAll(Arrays.asList(splitStr));
            }
        }
    }

}