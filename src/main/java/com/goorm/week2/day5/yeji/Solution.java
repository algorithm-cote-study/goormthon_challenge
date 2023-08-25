package com.goorm.week2.day5.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Game Jam
 */
public class Solution {


    private static Map<String, int[]> direction;
    private static int[] playerCount;

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String solution(BufferedReader br) throws IOException {
        direction = new HashMap<>();
        direction.put("U", new int[]{-1, 0});
        direction.put("D", new int[]{1, 0});
        direction.put("R", new int[]{0, 1});
        direction.put("L", new int[]{0, -1});

        playerCount = new int[2];
        int n = Integer.parseInt(br.readLine());
        int[] grooms = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] player = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String[][] playerMap = new String[n][n];

        for (int i = 0; i < n; i++) {
            playerMap[i] = br.readLine().split(" ");
        }

        int x = grooms[0] - 1;
        int y = grooms[1] - 1;
        int count = Integer.parseInt(playerMap[x][y].split("")[0]);
        String command = playerMap[x][y].split("")[1];
        moveDirection(x, y, playerMap, new boolean[n][n], n, count, command, 0);
        x = player[0] - 1;
        y = player[1] - 1;
        count = Integer.parseInt(playerMap[x][y].split("")[0]);
        command = playerMap[x][y].split("")[1];
        moveDirection(x, y, playerMap, new boolean[n][n], n, count, command, 1);

        return playerCount[0] > playerCount[1] ? "goorm " + playerCount[0] : "player " + playerCount[1];
    }

    private static void moveDirection(int x, int y, String[][] playerMap, boolean[][] visited, int n, int count, String command, int index) {
        if (visited[x][y]) {
            return;
        }
        playerCount[index]++;
        if (count == 0) {
            String s = playerMap[x][y];
            count = Integer.parseInt(s.split("")[0]);
            command = s.split("")[1];
        }
        visited[x][y] = true;
        int cx = validate(n, direction.get(command)[0] + x);
        int cy = validate(n, direction.get(command)[1] + y);

        moveDirection(cx, cy, playerMap, visited, n, count - 1, command, index);
    }


    private static int validate(int n, int target) {
        if (target >= n) {
            target = 0;
        } else if (target < 0) {
            target = n - 1;
        }
        return target;
    }


}
