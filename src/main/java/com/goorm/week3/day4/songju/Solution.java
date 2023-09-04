package com.goorm.week3.day4.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 작은노드
 * Day : 23.08.31
 * Solving time : 18:34 ~ 19:15
 */
public class Solution {
    private static int N, M, K;
    private static ArrayList<ArrayList<Integer>> node;
    private static StringBuilder result;

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String solution(BufferedReader br) throws IOException {
        result = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        node = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            node.add(new ArrayList<>());
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int left = Integer.parseInt(st.nextToken());
            int right = Integer.parseInt(st.nextToken());
            node.get(left).add(right);
            node.get(right).add(left);
        }
        for (int i = 0; i <= N; i++) {
            Collections.sort(node.get(i));
        }
        dfs(K);
        return result.toString();
    }

    static void dfs(int start) {
        Deque<Integer> queue = new ArrayDeque<>();
        queue.offer(start);
        boolean[] visited = new boolean[N + 1];
        visited[start] = true;
        int cnt = 1;
        int v = start;
        while (!queue.isEmpty()) {
            int idx = queue.poll();
            for (int a : node.get(idx)) {
                if (!visited[a]) {
                    visited[a] = true;
                    queue.add(a);
                    cnt++;
                    v = a;
                    break;
                }
            }
        }
        result.append(cnt).append(" ").append(v);
    }
}
