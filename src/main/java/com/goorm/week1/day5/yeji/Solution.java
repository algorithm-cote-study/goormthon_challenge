package com.goorm.week1.day5.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 이진수 정렬 (195687)
 * 14'27"
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader br) throws IOException {
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        return sortedBinary(input[1], nums);
    }

    private static int sortedBinary(int compare, int[] nums) {
        Queue<Integer> priorityQueue = new PriorityQueue<>((a, b) -> {
            int binaryA = 0;
            int binaryB = 0;

            int compareA = a;
            while (compareA != 0) {
                if (compareA % 2 == 1) {
                    binaryA++;
                }
                compareA /= 2;
            }

            int compareB = b;
            while (compareB != 0) {
                if (compareB % 2 == 1) {
                    binaryB++;
                }
                compareB /= 2;
            }

            if (binaryA == binaryB) return b - a;
            return binaryB - binaryA;
        });

        for (int num : nums) {
            priorityQueue.offer(num);
        }

        int target = 1;
        while (!priorityQueue.isEmpty()) {
            int cur = priorityQueue.poll();
            if (target == compare) {
                return cur;
            }
            target++;
        }
        return 0;
    }
}
