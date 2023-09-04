    package com.goorm.week3.day5.songju;

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.*;

    /* 과일구매
     * Day : 23.09.02
     * Solving time : 20:34 ~ 21:50
     */
    public class Solution {
        public static void main(String[] args) {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println(solution(br));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static long solution(BufferedReader br) throws IOException {
            double result = 0;
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            ArrayList<Fruit> list = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                int p = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());
                list.add(new Fruit(c / p, p));
            }
            Collections.sort(list);
            for (int i = 0; i < N; i++) {
                Fruit fruit = list.get(i);
                double cnt = Math.min(fruit.price, K);
                K -= cnt;
                result += fruit.fully * cnt;
                if (K == 0) break;
            }
            return (long) result;
        }

        static class Fruit implements Comparable<Fruit> {
            private double fully;
            private double price;

            public Fruit(double fully, double price) {
                this.fully = fully;
                this.price = price;
            }

            @Override
            public int compareTo(Fruit f) {
                return this.fully != f.fully ? Double.compare(f.fully, this.fully) : Double.compare(f.price, this.price);
            }
        }
    }
