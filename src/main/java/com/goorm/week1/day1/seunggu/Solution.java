package com.goorm.week1.day1.seunggu;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(br));
        }catch(IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader br) throws IOException {
        String line = br.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(line, " ");
        double weight = Double.parseDouble(stringTokenizer.nextToken());
        double count = Double.parseDouble(stringTokenizer.nextToken());
        double rm = weight * (1 + count / 30);
        return (int)rm;
    }
}
