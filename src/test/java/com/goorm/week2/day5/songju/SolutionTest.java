package com.goorm.week2.day5.songju;

import com.goorm.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("GameJame - 송주")
class SolutionTest {
    @Test
    @DisplayName("GameJame - 케이스1")
    void test_case_1() throws Exception {
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/week2/day5/test_case1.txt");
        String solution = Solution.solution(reader);
        assertEquals("goorm 4", solution);
    }

    @Test
    @DisplayName("GameJame - 케이스2")
    void test_case_2() throws Exception {
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/week2/day5/test_case2.txt");
        String solution = Solution.solution(reader);
        assertEquals("player 6", solution);
    }

}