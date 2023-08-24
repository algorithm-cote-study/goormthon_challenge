package com.goorm.week2.day4.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 폭탄 구현하기 (2)
 * 8' 23"
 */
public class Solution {

    private static final int[] dx = {1, 0, -1, 0};
    private static final int[] dy = {0, 1, 0, -1};

    private static int max;

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int bombCount = Integer.parseInt(st.nextToken());
        String[][] map = new String[n][n];
        int[][] bombMap = new int[n][n];
        max = 0;

        for (int i = 0; i < n; i++) {
            map[i] = br.readLine().split(" ");
        }

        for (int i = 0; i < bombCount; i++) {
            int[] location = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            poppingBomb(location[0] - 1, location[1] - 1, map, bombMap, n);
        }

        return max;
    }

    private static void poppingBomb(int x, int y, String[][] map, int[][] bombMap, int n) {
        plusBomb(x, y, map, bombMap);

        for (int i = 0; i < 4; i++) {
            int cx = x + dx[i];
            int cy = y + dy[i];

            if (cx >= 0 && cx < n && cy >= 0 && cy < n && !"#".equals(map[cx][cy])) {
                plusBomb(cx, cy, map, bombMap);
                max = Math.max(max, bombMap[cx][cy]);
            }

        }

    }

    private static void plusBomb(int x, int y, String[][] map, int[][] bombMap) {
        if ("0".equals(map[x][y])) {
            bombMap[x][y]++;
            return;
        }
        bombMap[x][y] += 2;
    }
}
