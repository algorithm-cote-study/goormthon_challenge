package com.goorm.week2.day4.seunggu;

import static com.goorm.common.TestFileUtil.getInt;
import static com.goorm.week2.day4.seunggu.Solution.solution;
import static org.junit.jupiter.api.Assertions.*;

import com.goorm.common.TestFileUtil;
import java.io.BufferedReader;
import java.io.IOException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("폭탄 구현하기 (2) - 승구")
class SolutionTest {

    @Test
    @DisplayName("폭탄 구현하기 (2) 테스트 케이스1")
    void test_case_1() throws IOException {
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/week2/day4/test_case1.txt");
        int solution = solution(reader);
        assertEquals(getInt(TestFileUtil.getReader(this.getClass(), "testcase/week2/day4/answer1.txt")), solution);
    }
    @Test
    @DisplayName("폭탄 구현하기 (2) 테스트 케이스2")
    void test_case_2() throws IOException {
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/week2/day4/test_case2.txt");
        int solution = solution(reader);
        assertEquals(getInt(TestFileUtil.getReader(this.getClass(), "testcase/week2/day4/answer2.txt")), solution);
    }
}