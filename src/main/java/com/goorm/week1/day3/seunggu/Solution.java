package com.goorm.week1.day3.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            int sum = solution(reader);
            System.out.println(sum);
        }catch(IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader reader) throws IOException {
        int count = Integer.parseInt(reader.readLine());
        int sum = 0;
        for(int i=0; i<count; i++) {
            String[] line = reader.readLine().split(" ");
            sum += calculate(Integer.parseInt(line[0]), line[1], Integer.parseInt(line[2]));
        }
        return sum;
    }

    private static int calculate(int a, String operator, int b) {
        return switch (operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "/" -> a / b;
            default -> a * b;
        };
    }

}
