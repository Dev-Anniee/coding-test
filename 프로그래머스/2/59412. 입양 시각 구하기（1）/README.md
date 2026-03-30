# [level 2] 입양 시각 구하기(1) - 59412 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/59412) 

### 성능 요약

메모리: 0.0 MB, 시간: 0.00 ms

### 구분

코딩테스트 연습 > GROUP BY

### 채점결과

Empty

### 제출 일자

2026년 03월 30일 22:33:09

### 문제 설명

<p style="user-select: auto !important;"><code style="user-select: auto !important;">ANIMAL_OUTS</code> 테이블은 동물 보호소에서 입양 보낸 동물의 정보를 담은 테이블입니다. <code style="user-select: auto !important;">ANIMAL_OUTS</code> 테이블 구조는 다음과 같으며, <code style="user-select: auto !important;">ANIMAL_ID</code>, <code style="user-select: auto !important;">ANIMAL_TYPE</code>, <code style="user-select: auto !important;">DATETIME</code>, <code style="user-select: auto !important;">NAME</code>, <code style="user-select: auto !important;">SEX_UPON_OUTCOME</code>는 각각 동물의 아이디, 생물 종, 입양일, 이름, 성별 및 중성화 여부를 나타냅니다.</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">NAME</th>
<th style="user-select: auto !important;">TYPE</th>
<th style="user-select: auto !important;">NULLABLE</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">ANIMAL_ID</td>
<td style="user-select: auto !important;">VARCHAR(N)</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">ANIMAL_TYPE</td>
<td style="user-select: auto !important;">VARCHAR(N)</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">DATETIME</td>
<td style="user-select: auto !important;">DATETIME</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">NAME</td>
<td style="user-select: auto !important;">VARCHAR(N)</td>
<td style="user-select: auto !important;">TRUE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">SEX_UPON_OUTCOME</td>
<td style="user-select: auto !important;">VARCHAR(N)</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto !important;">보호소에서는 몇 시에 입양이 가장 활발하게 일어나는지 알아보려 합니다. 09:00부터 19:59까지, 각 시간대별로 입양이 몇 건이나 발생했는지 조회하는 SQL문을 작성해주세요. 이때 결과는 시간대 순으로 정렬해야 합니다.</p>

<h5 style="user-select: auto !important;">예시</h5>

<p style="user-select: auto !important;">SQL문을 실행하면 다음과 같이 나와야 합니다.</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">HOUR</th>
<th style="user-select: auto !important;">COUNT</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">9</td>
<td style="user-select: auto !important;">1</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">10</td>
<td style="user-select: auto !important;">2</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">11</td>
<td style="user-select: auto !important;">13</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">12</td>
<td style="user-select: auto !important;">10</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">13</td>
<td style="user-select: auto !important;">14</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">14</td>
<td style="user-select: auto !important;">9</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">15</td>
<td style="user-select: auto !important;">7</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">16</td>
<td style="user-select: auto !important;">10</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">17</td>
<td style="user-select: auto !important;">12</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">18</td>
<td style="user-select: auto !important;">16</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">19</td>
<td style="user-select: auto !important;">2</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<p style="user-select: auto !important;">본 문제는 <a href="https://www.kaggle.com/aaronschlegel/austin-animal-center-shelter-intakes-and-outcomes" target="_blank" rel="noopener" style="user-select: auto !important;">Kaggle의 "Austin Animal Center Shelter Intakes and Outcomes"</a>에서 제공하는 데이터를 사용하였으며 <a href="https://opendatacommons.org/licenses/odbl/1.0/" target="_blank" rel="noopener" style="user-select: auto !important;">ODbL</a>의 적용을 받습니다.</p>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges