# [level 2] 연도 별 평균 미세먼지 농도 조회하기 - 284530 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/284530) 

### 성능 요약

메모리: undefined, 시간: 

### 구분

코딩테스트 연습 > String， Date

### 채점결과

합계: 100.0 / 100.0

### 제출 일자

2026년 09월 07일 14:16:42

### 문제 설명

<p style="user-select: auto !important;"><code style="user-select: auto !important;">AIR_POLLUTION</code> 테이블은 전국의 월별 미세먼지 정보를 담은 테이블입니다. <code style="user-select: auto !important;">AIR_POLLUTION</code> 테이블의 구조는 다음과 같으며 <code style="user-select: auto !important;">LOCATION1</code>, <code style="user-select: auto !important;">LOCATION2</code>, <code style="user-select: auto !important;">YM</code>, <code style="user-select: auto !important;">PM_VAL1</code>, <code style="user-select: auto !important;">PM_VAL2</code>은 각각 지역구분1, 지역구분2, 측정일, 미세먼지 오염도, 초미세먼지 오염도를 의미합니다.</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">Column name</th>
<th style="user-select: auto !important;">Type</th>
<th style="user-select: auto !important;">Nullable</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">LOCATION1</td>
<td style="user-select: auto !important;">VARCHAR</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">LOCATION2</td>
<td style="user-select: auto !important;">VARCHAR</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">YM</td>
<td style="user-select: auto !important;">DATE</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">PM_VAL1</td>
<td style="user-select: auto !important;">NUMBER</td>
<td style="user-select: auto !important;">FLASE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">PM_VAL2</td>
<td style="user-select: auto !important;">NUMBER</td>
<td style="user-select: auto !important;">FLASE</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">문제</h5>

<p style="user-select: auto !important;"><code style="user-select: auto !important;">AIR_POLLUTION</code> 테이블에서 수원 지역의 연도 별 평균 미세먼지 오염도와 평균 초미세먼지 오염도를 조회하는 SQL문을 작성해주세요. 이때, 평균 미세먼지 오염도와 평균 초미세먼지 오염도의 컬럼명은 각각 <code style="user-select: auto !important;">PM10</code>, <code style="user-select: auto !important;">PM2.5</code>로 해 주시고, 값은 소수 셋째 자리에서 반올림해주세요.<br style="user-select: auto !important;">
결과는 연도를 기준으로 오름차순 정렬해주세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">예시</h5>

<p style="user-select: auto !important;"><code style="user-select: auto !important;">AIR_POLLUTION</code> 테이블이 다음과 같을 때</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">LOCATION1</th>
<th style="user-select: auto !important;">LOCATION2</th>
<th style="user-select: auto !important;">YM</th>
<th style="user-select: auto !important;">PM_VAL1</th>
<th style="user-select: auto !important;">PM_VAL2</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">경기도</td>
<td style="user-select: auto !important;">수원</td>
<td style="user-select: auto !important;">2018-01-01</td>
<td style="user-select: auto !important;">48</td>
<td style="user-select: auto !important;">27</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">경기도</td>
<td style="user-select: auto !important;">수원</td>
<td style="user-select: auto !important;">2018-02-01</td>
<td style="user-select: auto !important;">51</td>
<td style="user-select: auto !important;">30</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">경기도</td>
<td style="user-select: auto !important;">수원</td>
<td style="user-select: auto !important;">2018-03-01</td>
<td style="user-select: auto !important;">52</td>
<td style="user-select: auto !important;">21</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">경기도</td>
<td style="user-select: auto !important;">수원</td>
<td style="user-select: auto !important;">2018-04-01</td>
<td style="user-select: auto !important;">52</td>
<td style="user-select: auto !important;">20</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">경기도</td>
<td style="user-select: auto !important;">수원</td>
<td style="user-select: auto !important;">2018-05-01</td>
<td style="user-select: auto !important;">45</td>
<td style="user-select: auto !important;">19</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">경기도</td>
<td style="user-select: auto !important;">수원</td>
<td style="user-select: auto !important;">2018-06-01</td>
<td style="user-select: auto !important;">39</td>
<td style="user-select: auto !important;">17</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">경기도</td>
<td style="user-select: auto !important;">수원</td>
<td style="user-select: auto !important;">2018-07-01</td>
<td style="user-select: auto !important;">27</td>
<td style="user-select: auto !important;">15</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">경기도</td>
<td style="user-select: auto !important;">수원</td>
<td style="user-select: auto !important;">2018-08-01</td>
<td style="user-select: auto !important;">26</td>
<td style="user-select: auto !important;">16</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">경기도</td>
<td style="user-select: auto !important;">수원</td>
<td style="user-select: auto !important;">2018-09-01</td>
<td style="user-select: auto !important;">21</td>
<td style="user-select: auto !important;">12</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">경기도</td>
<td style="user-select: auto !important;">수원</td>
<td style="user-select: auto !important;">2018-10-01</td>
<td style="user-select: auto !important;">31</td>
<td style="user-select: auto !important;">18</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">경기도</td>
<td style="user-select: auto !important;">수원</td>
<td style="user-select: auto !important;">2018-11-01</td>
<td style="user-select: auto !important;">56</td>
<td style="user-select: auto !important;">21</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">경기도</td>
<td style="user-select: auto !important;">수원</td>
<td style="user-select: auto !important;">2018-12-01</td>
<td style="user-select: auto !important;">44</td>
<td style="user-select: auto !important;">27</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">서울시</td>
<td style="user-select: auto !important;">노원</td>
<td style="user-select: auto !important;">2018-11-01</td>
<td style="user-select: auto !important;">25</td>
<td style="user-select: auto !important;">45</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">경기도</td>
<td style="user-select: auto !important;">용인</td>
<td style="user-select: auto !important;">2018-02-01</td>
<td style="user-select: auto !important;">14</td>
<td style="user-select: auto !important;">21</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto !important;">SQL을 실행하면 다음과 같이 출력되어야 합니다.</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">YEAR</th>
<th style="user-select: auto !important;">PM10</th>
<th style="user-select: auto !important;">PM2.5</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">2018</td>
<td style="user-select: auto !important;">41</td>
<td style="user-select: auto !important;">20.25</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<p style="user-select: auto !important;">※ 공지 - 2023년 3월 4일 문제 오탈자가 수정되었습니다.</p>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges