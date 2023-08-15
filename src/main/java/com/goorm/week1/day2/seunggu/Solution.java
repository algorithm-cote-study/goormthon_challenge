package com.goorm.week1.day2.seunggu;
import java.util.*;
import java.io.*;
import java.time.*;
public class Solution {
    public static void main(String[] args) throws Exception {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));
        }catch(IOException e) {
            e.printStackTrace();
        }
    }

    static String solution(BufferedReader reader) throws IOException {
        int count = Integer.parseInt(reader.readLine());
        int[] array = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        LocalTime time = LocalTime.of(array[0], array[1]);
        for(int i=0; i<count; i++) {
            int min = Integer.parseInt(reader.readLine());
            time = time.plusMinutes(min);
        }
        return time.getHour() + " " + time.getMinute();
    }
}
