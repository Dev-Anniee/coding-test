# [level 3] 특정 조건을 만족하는 물고기별 수와 최대 길이 구하기 - 298519 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/298519) 

### 성능 요약

메모리: undefined, 시간: 

### 구분

코딩테스트 연습 > GROUP BY

### 채점결과

합계: 100.0 / 100.0

### 제출 일자

2026년 09월 08일 12:18:52

### 문제 설명

<p style="user-select: auto !important;">낚시앱에서 사용하는 <code style="user-select: auto !important;">FISH_INFO</code> 테이블은 잡은 물고기들의 정보를 담고 있습니다. <code style="user-select: auto !important;">FISH_INFO</code> 테이블의 구조는 다음과 같으며 <code style="user-select: auto !important;">ID</code>, <code style="user-select: auto !important;">FISH_TYPE</code>, <code style="user-select: auto !important;">LENGTH</code>, <code style="user-select: auto !important;">TIME</code>은 각각 잡은 물고기의 ID, 물고기의 종류(숫자), 잡은 물고기의 길이(cm), 물고기를 잡은 날짜를 나타냅니다. </p>
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
<td style="user-select: auto !important;">FISH_TYPE</td>
<td style="user-select: auto !important;">INTEGER</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">LENGTH</td>
<td style="user-select: auto !important;">FLOAT</td>
<td style="user-select: auto !important;">TRUE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">TIME</td>
<td style="user-select: auto !important;">DATE</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto !important;">단, 잡은 물고기의 길이가 10cm 이하일 경우에는 <code style="user-select: auto !important;">LENGTH</code> 가 NULL 이며, <code style="user-select: auto !important;">LENGTH</code> 에 NULL 만 있는 경우는 없습니다.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">문제</h5>

<p style="user-select: auto !important;"><code style="user-select: auto !important;">FISH_INFO</code>에서 평균 길이가 33cm 이상인 물고기들을 종류별로 분류하여 잡은 수, 최대 길이, 물고기의 종류를 출력하는 SQL문을 작성해주세요. 결과는 물고기 종류에 대해 오름차순으로 정렬해주시고, 10cm이하의 물고기들은 10cm로 취급하여 평균 길이를 구해주세요.</p>

<p style="user-select: auto !important;">컬럼명은 물고기의 종류 'FISH_TYPE', 잡은 수 'FISH_COUNT', 최대 길이 'MAX_LENGTH'로 해주세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">예시</h5>

<p style="user-select: auto !important;">예를 들어 <code style="user-select: auto !important;">FISH_INFO</code> 테이블이 다음과 같다면</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">ID</th>
<th style="user-select: auto !important;">FISH_TYPE</th>
<th style="user-select: auto !important;">LENGTH</th>
<th style="user-select: auto !important;">TIME</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">0</td>
<td style="user-select: auto !important;">0</td>
<td style="user-select: auto !important;">30</td>
<td style="user-select: auto !important;">2021/12/04</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">0</td>
<td style="user-select: auto !important;">50</td>
<td style="user-select: auto !important;">2020/03/07</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">0</td>
<td style="user-select: auto !important;">40</td>
<td style="user-select: auto !important;">2020/03/07</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">3</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">30</td>
<td style="user-select: auto !important;">2022/03/09</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">4</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">NULL</td>
<td style="user-select: auto !important;">2022/04/08</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">5</td>
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">32</td>
<td style="user-select: auto !important;">2020/04/28</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto !important;">물고기 종류가 0인 물고기들의 평균 길이는 (30 + 50 + 40) / 3 = 40cm 이고 물고기 종류가 1인 물고기들의 평균 길이는 (30 + 10) / 2 = 20cm 이며, 물고기 종류(가 2인 물고기들의 평균 길이는 (32) / 1 = 32cm 입니다. 따라서 평균길이가 33cm 인 물고기 종류는 0 이므로, 총 잡은 수는 3마리, 최대 길이는 50cm 이므로 결과는 다음과 같아야 합니다. </p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">FISH_COUNT</th>
<th style="user-select: auto !important;">MAX_LENGTH</th>
<th style="user-select: auto !important;">FISH_TYPE</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">3</td>
<td style="user-select: auto !important;">50</td>
<td style="user-select: auto !important;">0</td>
</tr>
</tbody>
      </table>

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges