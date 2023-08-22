package com.goorm.week2.day2.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 구름 찾기 깃발 (195689)
 * 14' 53"
 */
public class Solution {

    private static final int[] dx = {1, 1, 1, 0, -1, -1, -1, 0};
    private static final int[] dy = {1, 0, -1, -1, -1, 0, 1, 1};

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int findNum = Integer.parseInt(st.nextToken());

        int[][] board = new int[n][n];
        List<Cloud> locations = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            board[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    locations.add(Cloud.of(i, j));
                    board[i][j] = -1;
                }
            }
        }

        for (Cloud cloud : locations) {
            for (int i = 0; i < dx.length; i++) {
                int cx = cloud.x + dx[i];
                int cy = cloud.y + dy[i];

                if (cx >= 0 && cx < n && cy >= 0 && cy < n && board[cx][cy] != -1) {
                    board[cx][cy]++;
                }
            }
        }

        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == findNum) {
                    answer++;
                }
            }
        }

        return answer;
    }

    static class Cloud {

        private final int x;
        private final int y;

        Cloud(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public static Cloud of(int x, int y) {
            return new Cloud(x, y);
        }
    }
}
