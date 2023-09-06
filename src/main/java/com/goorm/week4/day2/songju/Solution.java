package com.goorm.week4.day2.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

/* 통신망 분석
 * Day : 23.09.05
 * Solving time : 19:25 ~ 20:40
 */
public class Solution {
    private static int N, M;
    private static ArrayList<ArrayList<Integer>> node;
    private static ArrayList<Components> comList;
    private static boolean[] isComponent;

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String solution(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        node = new ArrayList<>();
        isComponent = new boolean[N + 1];
        comList = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            node.add(new ArrayList<>());
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            node.get(a).add(b);
            node.get(b).add(a);
        }
        for (int i = 1; i <= N; i++) {
            if (!isComponent[i])
                dfs(i);
        }
        List<Integer> result = new ArrayList<>();
        double density = 0;

        for (Components c : comList) {
            List<Integer> temp = c.list;
            double tempDensity = c.density;
            if (Math.abs(tempDensity - density) < 1e-8) {
                if (result.size() > temp.size()) {
                    result = temp;
                    density = tempDensity;
                } else if (result.size() == temp.size()) {
                    if (temp.get(0) < result.get(0)) {
                        result = temp;
                        density = tempDensity;
                    }
                }
            } else if (tempDensity > density) {
                result = temp;
                density = tempDensity;
            }
        }

        return result.stream().map(String::valueOf).collect(Collectors.joining(" "));
    }

    static void dfs(int start) {
        Deque<Integer> queue = new ArrayDeque<>();
        List<Integer> com = new ArrayList<>();
        queue.offer(start);
        com.add(start);
        isComponent[start] = true;
        int cnt = 0;
        while (!queue.isEmpty()) {
            int idx = queue.poll();
            cnt += node.get(idx).size();
            for (int a : node.get(idx)) {
                if (!isComponent[a]) {
                    isComponent[a] = true;
                    queue.add(a);
                    com.add(a);
                }
            }
        }
        comList.add(new Components(com, cnt / 2)); // 회선은 양방향이므로
    }

    static class Components {
        private List<Integer> list;
        private int line;
        private double density;

        public Components(List<Integer> list, int line) {
            Collections.sort(list);
            this.list = list;
            this.line = line;
            this.density = (double) line / list.size();
        }
    }
}