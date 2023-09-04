package com.goorm.week4.day1.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 연합
 * Day : 23.09.04
 * Solving time : 20:10 ~ 20:40
 */
public class Solution {
    private static int N, M;
    private static ArrayList<ArrayList<Integer>> node;
    private static int[] parent;

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int solution(BufferedReader br) throws IOException {
        int result = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        node = new ArrayList<>();
        parent = new int[N+1];
        for (int i = 0; i <= N; i++) {
            parent[i] = i;
            node.add(new ArrayList<>());
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            node.get(a).add(b);
        }
        for (int i = 1; i <= N; i++) {
            for (int a : node.get(i)) {
                if (node.get(a).contains(i))
                    union(a, i);
            }
        }

        Set<Integer> unionSet = new HashSet<>();
        for (int i = 1; i <= N; i++) {
            unionSet.add(find(i));
        }
        result = unionSet.size();

        return result;
    }

    private static int find(int a) {
        if (parent[a] == a) return a;
        return parent[a] = find(parent[a]);
    }

    private static void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);
        if (fa < fb) {
            parent[fb] = fa;
        } else if (fa > fb) {
            parent[fa] = fb;
        }

    }
}
