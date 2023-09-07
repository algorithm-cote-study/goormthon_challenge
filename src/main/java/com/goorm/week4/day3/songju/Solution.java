package com.goorm.week4.day3.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 중첩점
 * Day : 23.09.06 - 23.09.07
 * Solving time : 19:45 ~ 18:25
 */
public class Solution {
    private static int N, M;
    private static long[][][] board;
    private static final int[] dx = {-1, 0, 0, 1}; // L U D R
    private static final int[] dy = {0, -1, 1, 0};

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static long solution(BufferedReader br) throws IOException {
        long result = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        board = new long[N][N][2];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int y = Integer.parseInt(st.nextToken()) - 1;
            int x = Integer.parseInt(st.nextToken()) - 1;
            char dir = st.nextToken().charAt(0);
            int moveIdx = 0;
            switch (dir) {
                case 'L' -> moveIdx = 0;
                case 'U' -> moveIdx = 1;
                case 'D' -> moveIdx = 2;
                case 'R' -> moveIdx = 3;
            }
            dfs(x, y, dx[moveIdx], dy[moveIdx]);
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                result += board[i][j][0] * board[i][j][1];
            }
        }
        return result;
    }

    static void dfs(int x, int y, int mx, int my) {
        if (mx != 0) board[y][x][0]++;
        if (my != 0) board[y][x][1]++;

        int moveX = x + mx;
        int moveY = y + my;
        if (moveX >= 0 && moveX < N && moveY >= 0 && moveY < N) {
            dfs(moveX, moveY, mx, my);
        }
    }
}