package com.goorm.week2.day1.seunggu;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int answer = solution(reader);
            System.out.println(answer);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader reader) throws IOException {
        int count = Integer.parseInt(reader.readLine());
        String words = reader.readLine();
        String lastWords = words.substring(0, count-1);
        String firstWords = words.substring(0,1);
        TreeMap<String, Boolean> map = new TreeMap<>();

        int index = 1;
        List<Order> orderList = new ArrayList<>();
        while(!firstWords.equals(lastWords)) {
            map.put(firstWords, true);
            for(int i=index; i<count-1; i++) {
                String second = words.substring(index, i+1);
                map.put(second, true);
                String last = words.substring(i+1);

                map.put(last, true);
                orderList.add(Order.of(firstWords, second, last));
            }
            firstWords = words.substring(0, ++index);
        }
        Map<String, Integer> scores = new HashMap<>();
        int score = 1;
        for(Map.Entry<String, Boolean> entry : map.entrySet()) {
            scores.put(entry.getKey(), score++);
        }
        int answer = Integer.MIN_VALUE;
        for(Order order : orderList) {
            answer = Math.max(answer, order.calculateScore(scores));
        }
        return answer;
    }

    static class Order {
        private final String first;
        private final String second;
        private final String last;

        private Order(String first, String second, String last) {
            this.first = first;
            this.second = second;
            this.last = last;
        }

        public static Order of(String first, String second, String last) {
            return new Order(first, second, last);
        }

        public int calculateScore(Map<String, Integer> map) {
            return map.get(first) + map.get(second) + map.get(last);
        }
    }

}
