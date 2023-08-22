package com.goorm.week2.day2.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/* 구름 찾기 깃발
 * Day : 23.08.22
 * Solving time : 18:33 ~ 18:48
 */
public class Solution {
    private static int N;
    private static int[][] board, flag;
    private static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};  //좌하 좌 좌상 하 상 우하 우 우상
    private static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

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
        N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int result = 0;
        board = new int[N][N];
        flag = new int[N][N];
        for (int i = 0; i < N; i++) {
            board[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i][j] != 1) { //구름 위치가 아닐때 주변 구름 찾기
                    setFlag(j, i);
                    if (flag[i][j] == K)
                        result++;
                }
            }
        }
        return result;
    }

    private static void setFlag(int x, int y) {
        int goormCnt = 0;
        for (int i = 0; i < 8; i++) {
            int moveX = x + dx[i];
            int moveY = y + dy[i];
            if (moveX >= 0 && moveX < N && moveY >= 0 && moveY < N && board[moveY][moveX] == 1) {
                goormCnt++;
            }
        }
        flag[y][x] = goormCnt;
    }
}