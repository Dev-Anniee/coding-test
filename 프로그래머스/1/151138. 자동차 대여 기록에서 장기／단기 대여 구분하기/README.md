# [level 1] 자동차 대여 기록에서 장기/단기 대여 구분하기 - 151138 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/151138) 

### 성능 요약

메모리: undefined, 시간: 

### 구분

코딩테스트 연습 > String， Date

### 채점결과

합계: 100.0 / 100.0

### 제출 일자

2026년 09월 07일 13:20:28

### 문제 설명

<p style="user-select: auto !important;">다음은 어느 자동차 대여 회사의 자동차 대여 기록 정보를 담은 <code style="user-select: auto !important;">CAR_RENTAL_COMPANY_RENTAL_HISTORY</code> 테이블입니다. <code style="user-select: auto !important;">CAR_RENTAL_COMPANY_RENTAL_HISTORY</code> 테이블은 아래와 같은 구조로 되어있으며, <code style="user-select: auto !important;">HISTORY_ID</code>, <code style="user-select: auto !important;">CAR_ID</code>, <code style="user-select: auto !important;">START_DATE</code>, <code style="user-select: auto !important;">END_DATE</code> 는 각각 자동차 대여 기록 ID, 자동차 ID, 대여 시작일, 대여 종료일을 나타냅니다.</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">Column name</th>
<th style="user-select: auto !important;">Type</th>
<th style="user-select: auto !important;">Nullable</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">HISTORY_ID</td>
<td style="user-select: auto !important;">INTEGER</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">CAR_ID</td>
<td style="user-select: auto !important;">INTEGER</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">START_DATE</td>
<td style="user-select: auto !important;">DATE</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">END_DATE</td>
<td style="user-select: auto !important;">DATE</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">문제</h5>

<p style="user-select: auto !important;"><code style="user-select: auto !important;">CAR_RENTAL_COMPANY_RENTAL_HISTORY</code> 테이블에서 대여 시작일이 2022년 9월에 속하는 대여 기록에 대해서 대여 기간이 30일 이상이면 '장기 대여' 그렇지 않으면 '단기 대여' 로 표시하는 컬럼(컬럼명: <code style="user-select: auto !important;">RENT_TYPE</code>)을 추가하여 대여기록을 출력하는 SQL문을 작성해주세요. 결과는 대여 기록 ID를 기준으로 내림차순 정렬해주세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">예시</h5>

<p style="user-select: auto !important;">예를 들어 <code style="user-select: auto !important;">CAR_RENTAL_COMPANY_RENTAL_HISTORY</code> 테이블이 다음과 같다면</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">HISTORY_ID</th>
<th style="user-select: auto !important;">CAR_ID</th>
<th style="user-select: auto !important;">START_DATE</th>
<th style="user-select: auto !important;">END_DATE</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">4</td>
<td style="user-select: auto !important;">2022-09-27</td>
<td style="user-select: auto !important;">2022-11-27</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">3</td>
<td style="user-select: auto !important;">2022-10-03</td>
<td style="user-select: auto !important;">2022-11-04</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">3</td>
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">2022-09-05</td>
<td style="user-select: auto !important;">2022-09-05</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">4</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">2022-09-01</td>
<td style="user-select: auto !important;">2022-09-30</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">5</td>
<td style="user-select: auto !important;">3</td>
<td style="user-select: auto !important;">2022-09-16</td>
<td style="user-select: auto !important;">2022-10-15</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto !important;">2022년 9월의 대여 기록 중 '장기 대여' 에 해당하는 기록은 대여 기록 ID가 1, 4인 기록이고, '단기 대여' 에 해당하는 기록은 대여 기록 ID가 3, 5 인 기록이므로 대여 기록 ID를 기준으로 내림차순 정렬하면 다음과 같이 나와야 합니다.</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">HISTORY_ID</th>
<th style="user-select: auto !important;">CAR_ID</th>
<th style="user-select: auto !important;">START_DATE</th>
<th style="user-select: auto !important;">END_DATE</th>
<th style="user-select: auto !important;">RENT_TYPE</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">5</td>
<td style="user-select: auto !important;">3</td>
<td style="user-select: auto !important;">2022-09-16</td>
<td style="user-select: auto !important;">2022-10-13</td>
<td style="user-select: auto !important;">단기 대여</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">4</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">2022-09-01</td>
<td style="user-select: auto !important;">2022-09-30</td>
<td style="user-select: auto !important;">장기 대여</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">3</td>
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">2022-09-05</td>
<td style="user-select: auto !important;">2022-09-05</td>
<td style="user-select: auto !important;">단기 대여</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">4</td>
<td style="user-select: auto !important;">2022-09-27</td>
<td style="user-select: auto !important;">2022-10-26</td>
<td style="user-select: auto !important;">장기 대여</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">주의사항</h5>

<p style="user-select: auto !important;"><code style="user-select: auto !important;">START_DATE</code>와 <code style="user-select: auto !important;">END_DATE</code>의 경우 예시의 데이트 포맷과 동일해야 정답처리 됩니다.</p>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges