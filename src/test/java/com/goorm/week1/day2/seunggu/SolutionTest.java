package com.goorm.week1.day2.seunggu;

import static com.goorm.common.TestFileUtil.getString;
import static com.goorm.week1.day2.seunggu.Solution.solution;
import static org.junit.jupiter.api.Assertions.*;

import com.goorm.common.TestFileUtil;
import java.io.BufferedReader;
import java.io.IOException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("프로젝트 매니징")
class SolutionTest {

    @Test
    @DisplayName("프로젝트 매니징 테스트 케이스1")
    void test_case_1() throws IOException {
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "week1/day2/test_case1.txt");
        String solution = solution(reader);
        assertEquals(getString(TestFileUtil.getReader(this.getClass(), "week1/day2/answer1.txt")), solution);
    }
    @Test
    @DisplayName("프로젝트 매니징 테스트 케이스2")
    void test_case_2() throws IOException {
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "week1/day2/test_case2.txt");
        String solution = solution(reader);
        assertEquals(getString(TestFileUtil.getReader(this.getClass(), "week1/day2/answer2.txt")), solution);
    }
}