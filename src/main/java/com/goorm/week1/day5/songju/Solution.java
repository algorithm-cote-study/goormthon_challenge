package com.goorm.week1.day5.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/* 이진수 정렬
 * Day : 23.08.19
 * Solving time : 05:45 ~ 06:01
 */
public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int solution(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int idx = 0;
        PriorityQueue<BinaryNum> queue = new PriorityQueue<>();

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            queue.offer(BinaryNum.of(num, Integer.toBinaryString(num)));
        }

        while (!queue.isEmpty()) {
            BinaryNum binaryNum = queue.poll();
            idx++;
            if (idx == K) {
                return binaryNum.num;
            }
        }
        return 0;
    }

    static class BinaryNum implements Comparable<BinaryNum> {
        private int num;
        private String binary;
        private int oneCnt;

        private BinaryNum(int num, String binary) {
            this.num = num;
            this.binary = binary;
            this.oneCnt = this.binary.length() - this.binary.replaceAll("1", "").length();
        }

        public static BinaryNum of(int num, String binary) {
            return new BinaryNum(num, binary);
        }

        @Override
        public int compareTo(BinaryNum o1) {
            if (this.oneCnt == o1.oneCnt) {
                return o1.num - this.num;
            }
            return o1.oneCnt - this.oneCnt;
        }
    }

}