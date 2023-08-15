package com.goorm.week1.day2.songju;

import com.goorm.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("프로젝트 매니징 - 송주")
class SolutionTest {
    @Test
    @DisplayName("프로젝트 매니징 - 케이스1")
    void test_case_1() throws Exception {
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/week1/day2/test_case1.txt");
        String solution = Solution.solution(reader);
        assertEquals("11 45", solution);
    }

    @Test
    @DisplayName("프로젝트 매니징 - 케이스2")
    void test_case_2() throws Exception {
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/week1/day2/test_case2.txt");
        String solution = Solution.solution(reader);
        assertEquals("0 0", solution);
    }

}