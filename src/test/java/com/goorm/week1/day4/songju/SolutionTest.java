package com.goorm.week1.day4.songju;

import com.goorm.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("완벽한 햄버거 만들기 - 송주")
class SolutionTest {
    @Test
    @DisplayName("완벽한 햄버거 만들기 테스트 케이스1")
    void test_case_1() throws IOException {
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/week1/day4/test_case1.txt");
        int solution = Solution.solution(reader);
        assertEquals(10, solution);
    }
    @Test
    @DisplayName("완벽한 햄버거 만들기 테스트 케이스2")
    void test_case_2() throws IOException {
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/week1/day4/test_case2.txt");
        int solution = Solution.solution(reader);
        assertEquals(0, solution);
    }
}