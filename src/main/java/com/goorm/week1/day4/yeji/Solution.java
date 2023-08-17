package com.goorm.week1.day4.yeji;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 완벽한 햄버거 만들기 (195686)
 * 11'50"
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader br) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] ingredients = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        return perfectHamburger(n, ingredients);
    }

    private static int perfectHamburger(int n, int[] ingredients) {
        int index = 0;
        int max = ingredients[0];

        for (int i = 1; i < ingredients.length; i++) {
            if (max < ingredients[i]) {
                max = ingredients[i];
                index = i;
            }
        }

        return isDescendingOrderByLeft(max, index, ingredients) || isDescendingOrderByRight(n, max, index, ingredients) ? 0 : Arrays.stream(ingredients).sum();
    }

    private static boolean isDescendingOrderByLeft(int max, int index, int[] ingredients) {
        for (int i = index - 1; i >= 0; i--) {
            if (ingredients[i] > max) {
                return true;
            }
            max = ingredients[i];
        }
        return false;
    }

    private static boolean isDescendingOrderByRight(int n, int max, int index, int[] ingredients) {
        for (int i = index + 1; i < n; i++) {
            if (max < ingredients[i]) {
                return true;
            }
            max = ingredients[i];
        }

        return false;
    }
}
