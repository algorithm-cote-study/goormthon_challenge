package com.goorm.week2.day5.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* GameJame
 * Day : 23.08.26
 * Solving time : 20:01 ~ 20:43
 */
public class Solution {
    private static int N;
    private static String[][] turn;

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String solution(BufferedReader br) throws IOException {
        StringBuilder result = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        int[][] startPosList = new int[2][2];
        startPosList[0] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        startPosList[1] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        turn = new String[N][N];
        for (int i = 0; i < N; i++) {
            turn[i] = br.readLine().split(" ");
        }

        int gScore = playGame(startPosList[0][0] - 1, startPosList[0][1] - 1);
        int pScore = playGame(startPosList[1][0] - 1, startPosList[1][1] - 1);

        if (gScore > pScore) {
            result.append("goorm").append(" ").append(gScore);
        } else {
            result.append("player").append(" ").append(pScore);
        }
        return result.toString();
    }

    static int playGame(int y, int x) {
        int score = 1;
        boolean[][] visited = new boolean[N][N];
        visited[y][x] = true;
        while (true) {
            int distance = Integer.parseInt(turn[y][x].substring(0, turn[y][x].length() - 1));
            String dir = turn[y][x].substring(turn[y][x].length() - 1);
            for (int i = 0; i < distance; i++) {
                switch (dir) {
                    case "L" -> { x += -1; }
                    case "R" -> { x += 1; }
                    case "D" -> { y += 1; }
                    case "U" -> { y += -1; }
                }
                x = changePos(x);
                y = changePos(y);
                if (visited[y][x]) {
                    return score;
                }
                score++;
                visited[y][x] = true;
            }
        }
    }

    static int changePos(int index) {
        return (index < 0 ? index + N : index) % N;
    }
}