package com.goorm.week2.day2.seunggu;

import java.io.*;
import java.util.*;

class Solution {
    private static final int[] dx={0,-1,0,1,-1,-1,1,1};
    private static final int[] dy={1,0,-1,0,1,-1,1,-1};

    public static void main(String[] args) throws Exception {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int answer = solution(reader);
            System.out.println(answer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader reader) throws IOException {
        int[] array = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int count = array[0];
        int number = array[1];
        int[][] boards = new int[count][count];
        for(int i=0; i<count; i++) {
            boards[i] = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        int[][] answerBoard = new int[count][count];
        makeAnswerBoard(boards, count, answerBoard);
        int answer = 0;
        for (int[] ints : answerBoard) {
            for (int anInt : ints) {
                if (anInt == number) {
                    answer++;
                }
            }
        }
        return answer;
    }

    private static void makeAnswerBoard(int[][] boards, int count, int[][] answerBoard) {
        for(int i=0; i< boards.length; i++) {
            for(int j=0; j< boards[i].length; j++) {
                countFlag(boards, count, answerBoard, i, j);
            }
        }
    }

    private static void countFlag(int[][] boards, int count, int[][] answerBoard, int i, int j) {
        int sum = 0;
        if(boards[i][j] == 0) {
            for(int k=0; k<dx.length; k++) {
                int nx = i + dx[k];
                int ny = j + dy[k];
                if(nx >= 0 && nx < count && ny >= 0 && ny < count && boards[nx][ny] == 1) {
                    sum++;
                }
            }
            answerBoard[i][j] = sum;
        }
    }
}