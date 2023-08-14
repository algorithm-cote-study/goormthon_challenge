package com.goorm.week1.day1.seunggu;

import static com.goorm.week1.day1.seunggu.Solution.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.goorm.common.TestFileUtil;
import java.io.BufferedReader;
import java.io.IOException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("운동 중독 플레이어")
class SolutionTest {

    @Test
    @DisplayName("운동 중독 플레이어 테스트 케이스1")
    void test_case_1() throws IOException {
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "week1/day1/test_case1.txt");
        int solution = solution(reader);
        assertEquals(200, solution);
    }
    @Test
    @DisplayName("운동 중독 플레이어 테스트 케이스2")
    void test_case_2() throws IOException {
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "week1/day1/test_case2.txt");
        int solution = solution(reader);
        assertEquals(133, solution);
    }
}