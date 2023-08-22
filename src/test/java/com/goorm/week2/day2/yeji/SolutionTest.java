package com.goorm.week2.day2.yeji;

import static com.goorm.week2.day2.yeji.Solution.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.goorm.common.TestFileUtil;
import java.io.BufferedReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("구름 찾기 깃발 - 예지")
class SolutionTest {


    @Test
    @DisplayName("구름 찾기 깃발 - 케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/week2/day2/test_case1.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(2, solution);
    }

    @Test
    @DisplayName("구름 찾기 깃발 - 케이스2")
    void test_case_2() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/week2/day2/test_case2.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(1, solution);
    }
}