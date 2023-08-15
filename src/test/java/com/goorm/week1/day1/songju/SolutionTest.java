package com.goorm.week1.day1.songju;

import com.goorm.common.TestFileUtil;
import com.goorm.week1.day1.songju.Solution;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("운동 중독 플레이어 - 송주")
class SolutionTest {
    @Test
    @DisplayName("운동 중독 플레이어 - 케이스1")
    void test_case_1() throws Exception {
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/week1/day1/test_case1.txt");
        int solution = Solution.solution(reader);
        assertEquals(200, solution);
    }

    @Test
    @DisplayName("운동 중독 플레이어 - 케이스2")
    void test_case_2() throws Exception {
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/week1/day1/test_case2.txt");
        int solution = Solution.solution(reader);
        assertEquals(133, solution);
    }

}