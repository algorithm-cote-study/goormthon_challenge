package com.goorm.week2.day4.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 폭탄 구현하기(2)
 * Day : 23.08.24
 * Solving time : 14:50 ~ 15:30
 */
public class Solution {
    private static int N, K;
    private static char [][] board;
    private static int [][] boom;
    private static int result;
    private static int [] dx = {-1, 0, 0, 1};
    private static int [] dy = {0, -1, 1, 0};

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
        K = Integer.parseInt(st.nextToken());
        board = new char[N][N];
        boom = new int[N][N];
        result = 0;
        for(int i=0;i<N;i++){
            board[i] = br.readLine().replaceAll(" ", "").toCharArray();
        }

        for(int i=0;i<K;i++){
            st = new StringTokenizer(br.readLine(), " ");
            int y = Integer.parseInt(st.nextToken())-1;
            int x = Integer.parseInt(st.nextToken())-1;
            dropBoom(x, y);
        }

        return result;
    }

    private static void dropBoom(int x, int y){
        if(board[y][x] !='#')
            boom[y][x] += (board[y][x] == '0' ? 1 : 2);
        for(int i=0;i<4;i++){
            int moveX = x + dx[i];
            int moveY = y + dy[i];
            if(moveX >= 0 && moveX<N && moveY>=0 && moveY<N&&board[moveY][moveX] != '#'){
                boom[moveY][moveX] += (board[moveY][moveX] == '0' ? 1 : 2);
                result = Math.max(result, Math.max(boom[moveY][moveX], boom[y][x]));
            }
        }
    }
}