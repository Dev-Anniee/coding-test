# [level 3] 대장균의 크기에 따라 분류하기 2 - 301649 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/301649) 

### 성능 요약

메모리: undefined, 시간: 

### 구분

코딩테스트 연습 > SELECT

### 채점결과

합계: 100.0 / 100.0

### 제출 일자

2026년 02월 28일 12:32:04

### 문제 설명

<p style="user-select: auto !important;">대장균들은 일정 주기로 분화하며, 분화를 시작한 개체를 부모 개체, 분화가 되어 나온 개체를 자식 개체라고 합니다.<br style="user-select: auto !important;">
다음은 실험실에서 배양한 대장균들의 정보를 담은 <code style="user-select: auto !important;">ECOLI_DATA</code> 테이블입니다. <code style="user-select: auto !important;">ECOLI_DATA</code> 테이블의 구조는 다음과 같으며,  <code style="user-select: auto !important;">ID</code>, <code style="user-select: auto !important;">PARENT_ID</code>, <code style="user-select: auto !important;">SIZE_OF_COLONY</code>, <code style="user-select: auto !important;">DIFFERENTIATION_DATE</code>, <code style="user-select: auto !important;">GENOTYPE</code> 은 각각 대장균 개체의 ID, 부모 개체의 ID, 개체의 크기, 분화되어 나온 날짜, 개체의 형질을 나타냅니다.</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">Column name</th>
<th style="user-select: auto !important;">Type</th>
<th style="user-select: auto !important;">Nullable</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">ID</td>
<td style="user-select: auto !important;">INTEGER</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">PARENT_ID</td>
<td style="user-select: auto !important;">INTEGER</td>
<td style="user-select: auto !important;">TRUE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">SIZE_OF_COLONY</td>
<td style="user-select: auto !important;">INTEGER</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">DIFFERENTIATION_DATE</td>
<td style="user-select: auto !important;">DATE</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">GENOTYPE</td>
<td style="user-select: auto !important;">INTEGER</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto !important;">최초의 대장균 개체의 <code style="user-select: auto !important;">PARENT_ID</code> 는 NULL 값입니다.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">문제</h5>

<p style="user-select: auto !important;">대장균 개체의 크기를 내름차순으로 정렬했을 때 상위 0% ~ 25% 를 'CRITICAL', 26% ~ 50% 를 'HIGH', 51% ~ 75% 를 'MEDIUM', 76% ~ 100% 를 'LOW' 라고 분류합니다. 대장균 개체의 ID(<code style="user-select: auto !important;">ID</code>) 와 분류된 이름(<code style="user-select: auto !important;">COLONY_NAME</code>)을 출력하는 SQL 문을 작성해주세요. 이때 결과는 개체의 ID 에 대해 오름차순 정렬해주세요 . 단, 총 데이터의 수는 4의 배수이며 같은 사이즈의 대장균 개체가 서로 다른 이름으로 분류되는 경우는 없습니다.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">예시</h5>

<p style="user-select: auto !important;">예를 들어 <code style="user-select: auto !important;">ECOLI_DATA</code> 테이블이 다음과 같다면</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">ID</th>
<th style="user-select: auto !important;">PARENT_ID</th>
<th style="user-select: auto !important;">SIZE_OF_COLONY</th>
<th style="user-select: auto !important;">DIFFERENTIATION_DATE</th>
<th style="user-select: auto !important;">GENOTYPE</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">NULL</td>
<td style="user-select: auto !important;">10</td>
<td style="user-select: auto !important;">2019/01/01</td>
<td style="user-select: auto !important;">5</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">NULL</td>
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">2019/01/01</td>
<td style="user-select: auto !important;">3</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">3</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">100</td>
<td style="user-select: auto !important;">2020/01/01</td>
<td style="user-select: auto !important;">4</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">4</td>
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">16</td>
<td style="user-select: auto !important;">2020/01/01</td>
<td style="user-select: auto !important;">4</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">5</td>
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">17</td>
<td style="user-select: auto !important;">2020/01/01</td>
<td style="user-select: auto !important;">6</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">6</td>
<td style="user-select: auto !important;">4</td>
<td style="user-select: auto !important;">101</td>
<td style="user-select: auto !important;">2021/01/01</td>
<td style="user-select: auto !important;">22</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">7</td>
<td style="user-select: auto !important;">6</td>
<td style="user-select: auto !important;">101</td>
<td style="user-select: auto !important;">2022/01/01</td>
<td style="user-select: auto !important;">23</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">8</td>
<td style="user-select: auto !important;">6</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">2022/01/01</td>
<td style="user-select: auto !important;">27</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto !important;">기준에 의해 분류된 대장균들의 ID는 다음과 같습니다.</p>

<p style="user-select: auto !important;">CRITICAL (상위 0% ~ 25%) : ID 6, ID 7<br style="user-select: auto !important;">
HIGH (상위 26% ~ 50%) : ID 3, ID 5<br style="user-select: auto !important;">
MEDIUM (상위 51% ~ 75%) : ID 1, ID 4<br style="user-select: auto !important;">
LOW (상위 76% ~ 100%) : ID 2, ID 8</p>

<p style="user-select: auto !important;">따라서 결과를 ID 에 대해 오름차순 정렬하면 다음과 같아야 합니다.</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">ID</th>
<th style="user-select: auto !important;">COLONY_NAME</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">MEDIUM</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">LOW</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">3</td>
<td style="user-select: auto !important;">HIGH</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">4</td>
<td style="user-select: auto !important;">MEDIUM</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">5</td>
<td style="user-select: auto !important;">HIGH</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">6</td>
<td style="user-select: auto !important;">CRITICAL</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">7</td>
<td style="user-select: auto !important;">CRITICAL</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">8</td>
<td style="user-select: auto !important;">LOW</td>
</tr>
</tbody>
      </table>

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges