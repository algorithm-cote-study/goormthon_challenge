package com.goorm.week1.day1.yeji;

import static com.goorm.week1.day1.yeji.Solution.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.goorm.common.TestFileUtil;
import java.io.BufferedReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("운동 중독 플레이어 - 예지")
class SolutionTest {

    @Test
    @DisplayName("운동 중독 플레이어 - 케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/week1/day1/test_case1.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(200, solution);
    }

    @Test
    @DisplayName("운동 중독 플레이어 - 케이스2")
    void test_case_2() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/week1/day1/test_case2.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(133, solution);
    }

}