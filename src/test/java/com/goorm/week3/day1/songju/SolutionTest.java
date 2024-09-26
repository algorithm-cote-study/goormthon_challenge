package com.goorm.week3.day1.songju;

import com.goorm.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("통증(2) - 송주")
class SolutionTest {
    @Test
    @DisplayName("통증(2) - 케이스1")
    void test_case_1() throws Exception {
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/week3/day1/test_case1.txt");
        int solution = com.goorm.week3.day1.songju.Solution.solution(reader);
        assertEquals(3, solution);
    }

    @Test
    @DisplayName("통증(2) - 케이스2")
    void test_case_2() throws Exception {
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/week3/day1/test_case2.txt");
        int solution = Solution.solution(reader);
        assertEquals(772, solution);
    }

    @Test
    @DisplayName("통증(2) - 케이스3")
    void test_case_3() throws Exception {
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/week3/day1/test_case3.txt");
        int solution = Solution.solution(reader);
        assertEquals(2, solution);
    }

}
