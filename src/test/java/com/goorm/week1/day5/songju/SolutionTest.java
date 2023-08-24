package com.goorm.week1.day5.songju;

import com.goorm.common.TestFileUtil;
import com.goorm.week1.day4.songju.Solution;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("이진수 정렬 - 송주")
class SolutionTest {
    @Test
    @DisplayName("이진수 정렬 테스트 케이스1")
    void test_case_1() throws IOException {
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "week1/day5/test_case1.txt");
        int solution = com.goorm.week1.day4.songju.Solution.solution(reader);
        assertEquals(4, solution);
    }
    @Test
    @DisplayName("이진수 정렬 테스트 케이스2")
    void test_case_2() throws IOException {
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "week1/day5/test_case2.txt");
        int solution = Solution.solution(reader);
        assertEquals(64, solution);
    }
}