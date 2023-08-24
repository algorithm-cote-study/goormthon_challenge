package com.goorm.week2.day4.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 폭탄 구현하기 2
 */
public class Solution {

    private static final int[] dx = {0,1,0,-1};
    private static final int[] dy = {1,0,-1,0};

    public static void main(String[] args) throws Exception {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int num = solution(reader);
            System.out.println(num);
        }catch(IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader reader) throws IOException {
        int[] numbers = getArray(reader);
        int boardSize = numbers[0];
        int dropCount = numbers[1];
        int[][] answer = new int[boardSize][boardSize];
        String[][] board = makeBoard(boardSize, reader);
        int num = Integer.MIN_VALUE;
        for(int i=0; i<dropCount; i++) {
            int[] target = getArray(reader);
            int x = target[0] -1;
            int y = target[1] -1;
            dropBomb(board, x, y, answer);
            num = Math.max(num, answer[x][y]);
            for(int j=0; j < dx.length; j++) {
                int nx = target[0] + dx[j] -1;
                int ny = target[1] + dy[j] -1;
                if(nx >= 0 && nx < boardSize && ny >=0 && ny < boardSize && !"#".equals(board[nx][ny])) {
                   dropBomb(board, nx, ny, answer);
                   num = Math.max(num, answer[nx][ny]);
                }
            }
        }
        return num;
    }

    private static String[][] makeBoard(int boardSize, BufferedReader reader) throws IOException {
        String[][] board = new String[boardSize][boardSize];
        for(int i=0; i<board.length; i++) {
            board[i] = reader.readLine().split(" ");
        }
        return board;
    }

    private static void dropBomb(String[][] board, int x, int y, int[][] answer) {
        if("@".equals(board[x][y])) {
            answer[x][y] += 2;
            return;
        }
        if("0".equals(board[x][y])) {
            answer[x][y]++;
        }
    }

    private static int[] getArray(BufferedReader reader) throws IOException {
        return Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }

}
