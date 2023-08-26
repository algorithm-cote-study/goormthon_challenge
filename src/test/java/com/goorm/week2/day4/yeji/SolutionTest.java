package com.goorm.week2.day4.yeji;

import static com.goorm.week2.day4.yeji.Solution.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.goorm.common.TestFileUtil;
import java.io.BufferedReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("폭탄 구현하기(2) - 예지")
class SolutionTest {


    @Test
    @DisplayName("폭탄 구현하기(2) - 케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/week2/day4/test_case1.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(6, solution);
    }

    @Test
    @DisplayName("폭탄 구현하기(2) - 케이스2")
    void test_case_2() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/week2/day4/test_case2.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(8, solution);
    }
}