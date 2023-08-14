# [☁️ goormthon_challenge](https://9oormthonchallenge.oopy.io/?utm_source=community&utm_medium=social_affiliate&utm_content=pre_apply)

## 개요

## 🕙 챌린지 참여 방법

1. STEP 1 </br>
   월,화,수,목,금 평일 오전 10시 [도전하기] 버튼 클릭 후 챌린지 시작

2. STEP 2 </br>
   하루에 한문제 씩 풀기 (문제 공개 후 48시간 이내 풀어야 함)

3. STEP 3 </br>
문제가 공개된지 48시간이 지나기 전에 100점 받을 경우 1점 획득 </br>
ex) 월요일 문제 공개시 수요일까지 풀이완료

## PR 규칙
- 매주 화, 목

## 📝 풀이 유형

1. Week1 </br>
   8월 14일 ~ 8월 20 (구현)

2. Week2 </br>
   8월 21일 ~ 8월 27일 (완전탐색)

3. Week3 </br>
   8월 28일 ~ 9월 3일 (탐색, 동적 프로그래밍)

4. Week4 </br>
   9월 4일 ~ 9월 10일 (그래프 탐색)

## 문제 공개

| 주차(날짜)           | 유형    | 제목         | 링크                                                                                                                                         |
|------------------|-------|------------|--------------------------------------------------------------------------------------------------------------------------------------------|
| Week1(Day1-8/14) | 시뮬레이션 | 운동 중독 플레이어 | [운동 중독 플레이어(195683)](https://level.goorm.io/exam/195683/%EC%9A%B4%EB%8F%99-%EC%A4%91%EB%8F%85-%ED%94%8C%EB%A0%88%EC%9D%B4%EC%96%B4/quiz/1) |
| Week1(Day2-8/15) | 시뮬레이션 |            |                                                                                                                                            |
| Week1(Day3-8/16) | 시뮬레이션 |            |                                                                                                                                            |

## <img src="https://img.icons8.com/color/48/null/folder-tree.png" width="30" height="30" style="padding: 0;margin-bottom:-5px;"/> 패키지 생성 기준

1. 주차 별 -> 일자 별로 패키지 생성 </br>
2. 일자 별로 각자 이름의 패키지 생성후 풀이 작성 </br>

```
.
└── week1
    ├── day1  
    │   └── seunggu
    ├── day2
    │   └── seunggu
```

<img width="203" alt="image" src="https://github.com/algorithm-cote-study/goormthon_challenge/assets/98408267/a4738798-5fcd-40e0-8357-616435413118">

## <img src="https://img.icons8.com/color/48/null/java-files.png" width="30" height="30" style="padding: 0;margin-bottom:-5px;"/> 파일 생성 기준

Solution으로 통일해주세요 ex) Solution.java

## <img src="https://img.icons8.com/color/48/null/programming-flag.png" width="30" height="30" style="padding: 0;margin-bottom:-5px;"/> 테스트코드 작성법

1. test/resource/testcase 폴더에 문제 번호 별로 폴더 생성
2. 문제의 테스트 케이스 갯수 만큼 test_caseN.txt 파일 생성 (반례도 넣어도 됨) (ex. test_case1.txt, test_case2.txt,
   test_case3.txt ...)
3. 패키지 단위의 Test class 생성
    - 내가 만든 class 에서 cmd + shift + N 단축키 입력시 new Test..입력하면 자동으로 test class 생성
4. 테스트 코드 작성

```java

// 테스트케이스 만들기 예시
@DisplayName("체스판 다시 칠하기 - 승구")
class Main1018Test {

    @Test
    @DisplayName("체스판 다시 칠하기 테스트 케이스 1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(),
            "testcase/class2/1018/test_case1.txt");
        // when
        int solution = Main1018.solution(reader);

        // then
        assertEquals(1, solution);

    }

}

```

## <img src="https://img.icons8.com/color/48/null/github--v1.png" width="30" height="30" style="padding: 0;margin-bottom:-5px;"/> Git commit convention

- feat : 새로운 기능의 추가
- fix: 버그 수정
- docs: 문서 수정 (README)
- style: 스타일 관련 기능(코드 포맷팅, 세미콜론 누락, 코드 자체의 변경이 없는 경우)
- refactor: 코드 리펙토링
- test: 테스트 코트, 리펙토링 테스트 코드 추가
- chore: 빌드 업무 수정, 패키지 매니저 수정(ex .gitignore 수정 같은 경우)
- remove : 파일을 삭제하는 작업만 수행한 경우
- comment : 필요한 주석 추가 및 변경

## Contributors

<table >
    <tr height="140px">
        <td align="center" width="130px">
            <a href="https://github.com/cyeji"><img height="100px" width="100px" src="https://avatars.githubusercontent.com/u/98408267?v=4"/></a>
            <br />
            <a href="https://github.com/cyeji">cyeji</a>
        </td>
        <td align="center" width="130px">
            <a href="https://github.com/seunggulee1007"><img height="100px" width="100px" src="https://avatars.githubusercontent.com/u/32692807?v=4"/></a>
            <br />
            <a href="https://github.com/seunggulee1007">seunggulee1007</a>
        </td>
        <td align="center" width="130px">
            <a href="https://github.com/songjuAhn"><img height="100px" width="100px" src="https://avatars.githubusercontent.com/u/18460680?v=4"/></a>
            <br />
            <a href="https://github.com/songjuAhn">songjuAhn</a>
        </td>
    </tr>
</table>
