package com.goorm.week2.day4.songju;

import com.goorm.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("폭탄 구현하기(2) - 송주")
class SolutionTest {
    @Test
    @DisplayName("폭탄 구현하기(2) - 케이스1")
    void test_case_1() throws Exception {
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/week2/day4/test_case1.txt");
        int solution = Solution.solution(reader);
        assertEquals(6, solution);
    }

    @Test
    @DisplayName("폭탄 구현하기(2) - 케이스2")
    void test_case_2() throws Exception {
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/week2/day4/test_case2.txt");
        int solution = Solution.solution(reader);
        assertEquals(8, solution);
    }

}