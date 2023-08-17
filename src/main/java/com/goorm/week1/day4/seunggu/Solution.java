package com.goorm.week1.day4.seunggu;

import java.io.*;
import java.util.Arrays;
public class Solution {

    public static void main(String[] args) throws Exception {
        // 16 분 소요
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println(solution(reader));

        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader reader) throws IOException {
        int count = Integer.parseInt(reader.readLine());
        int[] array = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int max = Integer.MIN_VALUE;
        int index = 0;
        for(int i=0; i<count; i++) {
            int number = array[i];
            if(number > max) {
                index = i;
                max = number;
            }
        }
        return getTasty(index, max, array);
    }

    public static int getTasty(int index, int max, int[] array) {
        int lt = index;
        int rt = index;
        int lMax = max;
        int rMax = max;
        int count = array.length;
        while(lt > 0 || rt < count) {
            int nLt = lt - 1;
            int nRt = rt + 1;
            if(nLt > 0) {
                if(lMax >= array[nLt]) {
                    lMax = array[nLt];
                }else {
                    return 0;
                }
            }
            if(nRt < count) {
                if(rMax >= array[nRt]) {
                    rMax = array[nRt];
                }else {
                    return 0;
                }
            }
            lt--;
            rt++;

        }
        return Arrays.stream(array).sum();
    }
}
