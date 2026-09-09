# [level 4] 연간 평가점수에 해당하는 평가 등급 및 성과금 조회하기 - 284528 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/284528) 

### 성능 요약

메모리: undefined, 시간: 

### 구분

코딩테스트 연습 > GROUP BY

### 채점결과

합계: 100.0 / 100.0

### 제출 일자

2026년 09월 09일 11:37:17

### 문제 설명

<p style="user-select: auto !important;"><code style="user-select: auto !important;">HR_DEPARTMENT</code> 테이블은 회사의 부서 정보를 담은 테이블입니다. <code style="user-select: auto !important;">HR_DEPARTMENT</code> 테이블의 구조는 다음과 같으며 <code style="user-select: auto !important;">DEPT_ID</code>, <code style="user-select: auto !important;">DEPT_NAME_KR</code>, <code style="user-select: auto !important;">DEPT_NAME_EN</code>, <code style="user-select: auto !important;">LOCATION</code>은 각각 부서 ID, 국문 부서명, 영문 부서명, 부서 위치를 의미합니다.</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">Column name</th>
<th style="user-select: auto !important;">Type</th>
<th style="user-select: auto !important;">Nullable</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">DEPT_ID</td>
<td style="user-select: auto !important;">VARCHAR</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">DEPT_NAME_KR</td>
<td style="user-select: auto !important;">VARCHAR</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">DEPT_NAME_EN</td>
<td style="user-select: auto !important;">VARCHAR</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">LOCATION</td>
<td style="user-select: auto !important;">VARCHAR</td>
<td style="user-select: auto !important;">FLASE</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto !important;"><code style="user-select: auto !important;">HR_EMPLOYEES</code> 테이블은 회사의 사원 정보를 담은 테이블입니다. <code style="user-select: auto !important;">HR_EMPLOYEES</code> 테이블의 구조는 다음과 같으며 <code style="user-select: auto !important;">EMP_NO</code>, <code style="user-select: auto !important;">EMP_NAME</code>, <code style="user-select: auto !important;">DEPT_ID</code>, <code style="user-select: auto !important;">POSITION</code>, <code style="user-select: auto !important;">EMAIL</code>, <code style="user-select: auto !important;">COMP_TEL</code>, <code style="user-select: auto !important;">HIRE_DATE</code>, <code style="user-select: auto !important;">SAL</code>은 각각 사번, 성명, 부서 ID, 직책, 이메일, 전화번호, 입사일, 연봉을 의미합니다.</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">Column name</th>
<th style="user-select: auto !important;">Type</th>
<th style="user-select: auto !important;">Nullable</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">EMP_NO</td>
<td style="user-select: auto !important;">VARCHAR</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">EMP_NAME</td>
<td style="user-select: auto !important;">VARCHAR</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">DEPT_ID</td>
<td style="user-select: auto !important;">VARCHAR</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">POSITION</td>
<td style="user-select: auto !important;">VARCHAR</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">EMAIL</td>
<td style="user-select: auto !important;">VARCHAR</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">COMP_TEL</td>
<td style="user-select: auto !important;">VARCHAR</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">HIRE_DATE</td>
<td style="user-select: auto !important;">DATE</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">SAL</td>
<td style="user-select: auto !important;">NUMBER</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto !important;"><code style="user-select: auto !important;">HR_GRADE</code> 테이블은 2022년 사원의 평가 정보를 담은 테이블입니다. <code style="user-select: auto !important;">HR_GRADE</code>의 구조는 다음과 같으며 <code style="user-select: auto !important;">EMP_NO</code>, <code style="user-select: auto !important;">YEAR</code>, <code style="user-select: auto !important;">HALF_YEAR</code>, <code style="user-select: auto !important;">SCORE</code>는 각각 사번, 연도, 반기, 평가 점수를 의미합니다.</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">Column name</th>
<th style="user-select: auto !important;">Type</th>
<th style="user-select: auto !important;">Nullable</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">EMP_NO</td>
<td style="user-select: auto !important;">VARCHAR</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">YEAR</td>
<td style="user-select: auto !important;">NUMBER</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">HALF_YEAR</td>
<td style="user-select: auto !important;">NUMBER</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">SCORE</td>
<td style="user-select: auto !important;">NUMBER</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">문제</h5>

<p style="user-select: auto !important;"><code style="user-select: auto !important;">HR_DEPARTMENT</code>, <code style="user-select: auto !important;">HR_EMPLOYEES</code>, <code style="user-select: auto !important;">HR_GRADE</code> 테이블을 이용해 사원별 성과금 정보를 조회하려합니다. 평가 점수별 등급과 등급에 따른 성과금 정보가 아래와 같을 때, 사번, 성명, 평가 등급, 성과금을 조회하는 SQL문을 작성해주세요.</p>

<p style="user-select: auto !important;">평가등급의 컬럼명은 <code style="user-select: auto !important;">GRADE</code>로, 성과금의 컬럼명은 <code style="user-select: auto !important;">BONUS</code>로 해주세요.<br style="user-select: auto !important;">
결과는 사번 기준으로 오름차순 정렬해주세요.</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">기준 점수</th>
<th style="user-select: auto !important;">평가 등급</th>
<th style="user-select: auto !important;">성과금(연봉 기준)</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">96 이상</td>
<td style="user-select: auto !important;">S</td>
<td style="user-select: auto !important;">20%</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">90 이상</td>
<td style="user-select: auto !important;">A</td>
<td style="user-select: auto !important;">15%</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">80 이상</td>
<td style="user-select: auto !important;">B</td>
<td style="user-select: auto !important;">10%</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">이외</td>
<td style="user-select: auto !important;">C</td>
<td style="user-select: auto !important;">0%</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">예시</h5>

<p style="user-select: auto !important;"><code style="user-select: auto !important;">HR_DEPARTMENT</code> 테이블이 다음과 같고</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">DEPT_ID</th>
<th style="user-select: auto !important;">DEPT_NAME_KR</th>
<th style="user-select: auto !important;">DEPT_NAME_EN</th>
<th style="user-select: auto !important;">LOCATION</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">D0001</td>
<td style="user-select: auto !important;">법무팀</td>
<td style="user-select: auto !important;">Law Dep</td>
<td style="user-select: auto !important;">그렙타워 4층</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">D0002</td>
<td style="user-select: auto !important;">인사팀</td>
<td style="user-select: auto !important;">Human resources</td>
<td style="user-select: auto !important;">그렙타워 4층</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">D0003</td>
<td style="user-select: auto !important;">총무팀</td>
<td style="user-select: auto !important;">General Affairs</td>
<td style="user-select: auto !important;">그렙타워 4층</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto !important;"><code style="user-select: auto !important;">HR_EMPLOYEES</code> 테이블이 다음과 같고</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">EMP_NO</th>
<th style="user-select: auto !important;">EMP_NAME</th>
<th style="user-select: auto !important;">DEPT_ID</th>
<th style="user-select: auto !important;">POSITION</th>
<th style="user-select: auto !important;">EMAIL</th>
<th style="user-select: auto !important;">COMP_TEL</th>
<th style="user-select: auto !important;">HIRE_DATE</th>
<th style="user-select: auto !important;">SAL</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">2017002</td>
<td style="user-select: auto !important;">정호식</td>
<td style="user-select: auto !important;">D0001</td>
<td style="user-select: auto !important;">팀장</td>
<td style="user-select: auto !important;"><a href="mailto:hosick_jung@grep.com" target="_blank" rel="noopener" style="user-select: auto !important;">hosick_jung@grep.com</a></td>
<td style="user-select: auto !important;">031-8000-1101</td>
<td style="user-select: auto !important;">2017-03-01</td>
<td style="user-select: auto !important;">65000000</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">2018001</td>
<td style="user-select: auto !important;">김민석</td>
<td style="user-select: auto !important;">D0001</td>
<td style="user-select: auto !important;">팀원</td>
<td style="user-select: auto !important;"><a href="mailto:minseock_kim@grep.com" target="_blank" rel="noopener" style="user-select: auto !important;">minseock_kim@grep.com</a></td>
<td style="user-select: auto !important;">031-8000-1102</td>
<td style="user-select: auto !important;">2018-03-01</td>
<td style="user-select: auto !important;">60000000</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">2019001</td>
<td style="user-select: auto !important;">김솜이</td>
<td style="user-select: auto !important;">D0002</td>
<td style="user-select: auto !important;">팀장</td>
<td style="user-select: auto !important;"><a href="mailto:somi_kim@grep.com" target="_blank" rel="noopener" style="user-select: auto !important;">somi_kim@grep.com</a></td>
<td style="user-select: auto !important;">031-8000-1106</td>
<td style="user-select: auto !important;">2019-03-01</td>
<td style="user-select: auto !important;">60000000</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">2020002</td>
<td style="user-select: auto !important;">김연주</td>
<td style="user-select: auto !important;">D0002</td>
<td style="user-select: auto !important;">팀원</td>
<td style="user-select: auto !important;"><a href="mailto:yeonjoo_kim@grep.com" target="_blank" rel="noopener" style="user-select: auto !important;">yeonjoo_kim@grep.com</a></td>
<td style="user-select: auto !important;">031-8000-1107</td>
<td style="user-select: auto !important;">2020-03-01</td>
<td style="user-select: auto !important;">53000000</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">2020005</td>
<td style="user-select: auto !important;">양성태</td>
<td style="user-select: auto !important;">D0003</td>
<td style="user-select: auto !important;">팀원</td>
<td style="user-select: auto !important;"><a href="mailto:sungtae_yang@grep.com" target="_blank" rel="noopener" style="user-select: auto !important;">sungtae_yang@grep.com</a></td>
<td style="user-select: auto !important;">031-8000-1112</td>
<td style="user-select: auto !important;">2020-03-01</td>
<td style="user-select: auto !important;">53000000</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto !important;"><code style="user-select: auto !important;">HR_GRADE</code> 테이블이 다음과 같을 때</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">EMP_NO</th>
<th style="user-select: auto !important;">YEAR</th>
<th style="user-select: auto !important;">HALF_YEAR</th>
<th style="user-select: auto !important;">SCORE</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">2017002</td>
<td style="user-select: auto !important;">2022</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">92</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">2018001</td>
<td style="user-select: auto !important;">2022</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">89</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">2019001</td>
<td style="user-select: auto !important;">2022</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">94</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">2020002</td>
<td style="user-select: auto !important;">2022</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">90</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">2020005</td>
<td style="user-select: auto !important;">2022</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">92</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">2017002</td>
<td style="user-select: auto !important;">2022</td>
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">84</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">2018001</td>
<td style="user-select: auto !important;">2022</td>
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">89</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">2019001</td>
<td style="user-select: auto !important;">2022</td>
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">81</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">2020002</td>
<td style="user-select: auto !important;">2022</td>
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">91</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">2020005</td>
<td style="user-select: auto !important;">2022</td>
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">81</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto !important;">다음과 같이 사원별 성과금 정보를 출력해야 합니다.</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">EMP_NO</th>
<th style="user-select: auto !important;">EMP_NAME</th>
<th style="user-select: auto !important;">GRADE</th>
<th style="user-select: auto !important;">BONUS</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">2017002</td>
<td style="user-select: auto !important;">정호식</td>
<td style="user-select: auto !important;">B</td>
<td style="user-select: auto !important;">6500000</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">2018001</td>
<td style="user-select: auto !important;">김민석</td>
<td style="user-select: auto !important;">B</td>
<td style="user-select: auto !important;">6000000</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">2019001</td>
<td style="user-select: auto !important;">김솜이</td>
<td style="user-select: auto !important;">B</td>
<td style="user-select: auto !important;">6000000</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">2020002</td>
<td style="user-select: auto !important;">김연주</td>
<td style="user-select: auto !important;">A</td>
<td style="user-select: auto !important;">7950000</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">2020005</td>
<td style="user-select: auto !important;">양성태</td>
<td style="user-select: auto !important;">B</td>
<td style="user-select: auto !important;">5300000</td>
</tr>
</tbody>
      </table>

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges