package com.goorm.week1.day2.yeji;

import static com.goorm.week1.day2.yeji.Solution.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.goorm.common.TestFileUtil;
import java.io.BufferedReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("프로젝트 매니징 - 예지")
class SolutionTest {


    @Test
    @DisplayName("프로젝트 매니징 - 케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/week1/day2/test_case1.txt");
        // when
        String solution = solution(reader);
        // then
        assertEquals("11 45", solution);
    }


    @Test
    @DisplayName("프로젝트 매니징 - 케이스2")
    void test_case_2() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/week1/day2/test_case2.txt");
        // when
        String solution = solution(reader);
        // then
        assertEquals("0 0", solution);
    }
}