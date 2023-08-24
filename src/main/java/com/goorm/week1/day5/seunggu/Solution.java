package com.goorm.week1.day5.seunggu;

import java.io.*;
import java.util.*;

class Solution {
    public static void main(String[] args) throws Exception {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));
        }catch(IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader reader) throws IOException {
        int[] array = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int find = array[1];
        int[] numbers = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        List<FindNumber> findNumbers = new ArrayList<>();
        for (int number : numbers) {
            findNumbers.add(FindNumber.of(number));
        }
        Collections.sort(findNumbers);
        return findNumbers.get(find - 1).number;
    }

    static class FindNumber implements Comparable<FindNumber>{

        private int count;
        private int number;

        public static FindNumber of(int number) {
            FindNumber findNumber = new FindNumber();
            findNumber.number = number;
            String n = Integer.toBinaryString(number);
            int cnt = 0;
            for(String b : n.split("")) {
                if("1".equals(b)) {
                    cnt++;
                }
            }
            findNumber.count = cnt;
            return findNumber;
        }

        @Override
        public int compareTo(FindNumber n) {
            if(n.count == this.count) {
                return n.number - this.number;
            }
            return n.count - this.count;
        }
    }
}