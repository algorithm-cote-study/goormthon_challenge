package com.goorm.week3.day2.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/* 발전기
 * Day : 23.08.29
 * Solving time : 18:30 ~ 19:58
 */
public class Solution {
    private static int N;
    private static int[][] village;
    private static boolean[][] visited;
    private static final int[] dx = {-1, 0, 0, 1};
    private static final int[] dy = {0, -1, 1, 0};

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader br) throws IOException {
        N = Integer.parseInt(br.readLine());
        village = new int[N][N];
        visited = new boolean[N][N];
        int result = 0;
        for (int i = 0; i < N; i++) {
            village[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j] && village[i][j] == 1) {
                    check(j, i);
                    result++;
                }
            }
        }
        return result;
    }

    static void check(int x, int y) {
        Deque<int[]> deque = new ArrayDeque<>();
        deque.add(new int[]{x, y});
        visited[y][x] = true;
        while (!deque.isEmpty()) {
            int[] pos = deque.poll();
            int posX = pos[0];
            int posY = pos[1];
            for (int i = 0; i < 4; i++) {
                int mx = posX + dx[i];
                int my = posY + dy[i];
                if (mx >= 0 && mx < N && my >= 0 && my < N && village[my][mx] == 1 && !visited[my][mx]) {
                    deque.offer(new int[]{mx, my});
                    visited[my][mx] = true;
                }
            }
        }
    }
}