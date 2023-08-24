package com.goorm.week2.day3.yeji;

import static com.goorm.week2.day3.yeji.Solution.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.goorm.common.TestFileUtil;
import java.io.BufferedReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("통증 - 예지")
class SolutionTest {


    @Test
    @DisplayName("통증 - 케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/week2/day3/test_case1.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(2, solution);
    }

    @Test
    @DisplayName("통증 - 케이스2")
    void test_case_2() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/week2/day3/test_case2.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(9, solution);
    }
}