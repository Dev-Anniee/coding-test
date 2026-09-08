# [level 4] 언어별 개발자 분류하기 - 276036 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/276036) 

### 성능 요약

메모리: undefined, 시간: 

### 구분

코딩테스트 연습 > GROUP BY

### 채점결과

합계: 100.0 / 100.0

### 제출 일자

2026년 09월 08일 12:43:03

### 문제 설명

<p style="user-select: auto !important;"><code style="user-select: auto !important;">SKILLCODES</code> 테이블은 개발자들이 사용하는 프로그래밍 언어에 대한 정보를 담은 테이블입니다. <code style="user-select: auto !important;">SKILLCODES</code> 테이블의 구조는 다음과 같으며,  <code style="user-select: auto !important;">NAME</code>, <code style="user-select: auto !important;">CATEGORY</code>, <code style="user-select: auto !important;">CODE</code>는 각각 스킬의 이름, 스킬의 범주, 스킬의 코드를 의미합니다. 스킬의 코드는 2진수로 표현했을 때 각 bit로 구분될 수 있도록 2의 제곱수로 구성되어 있습니다.</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">NAME</th>
<th style="user-select: auto !important;">TYPE</th>
<th style="user-select: auto !important;">UNIQUE</th>
<th style="user-select: auto !important;">NULLABLE</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">NAME</td>
<td style="user-select: auto !important;">VARCHAR(N)</td>
<td style="user-select: auto !important;">Y</td>
<td style="user-select: auto !important;">N</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">CATEGORY</td>
<td style="user-select: auto !important;">VARCHAR(N)</td>
<td style="user-select: auto !important;">N</td>
<td style="user-select: auto !important;">N</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">CODE</td>
<td style="user-select: auto !important;">INTEGER</td>
<td style="user-select: auto !important;">Y</td>
<td style="user-select: auto !important;">N</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto !important;"><code style="user-select: auto !important;">DEVELOPERS</code> 테이블은 개발자들의 프로그래밍 스킬 정보를 담은 테이블입니다. <code style="user-select: auto !important;">DEVELOPERS</code> 테이블의 구조는 다음과 같으며, <code style="user-select: auto !important;">ID</code>, <code style="user-select: auto !important;">FIRST_NAME</code>, <code style="user-select: auto !important;">LAST_NAME</code>, <code style="user-select: auto !important;">EMAIL</code>, <code style="user-select: auto !important;">SKILL_CODE</code>는 각각 개발자의 ID, 이름, 성, 이메일, 스킬 코드를 의미합니다. <code style="user-select: auto !important;">SKILL_CODE</code> 컬럼은 INTEGER 타입이고, 2진수로 표현했을 때 각 bit는 <code style="user-select: auto !important;">SKILLCODES</code> 테이블의 코드를 의미합니다.</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">NAME</th>
<th style="user-select: auto !important;">TYPE</th>
<th style="user-select: auto !important;">UNIQUE</th>
<th style="user-select: auto !important;">NULLABLE</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">ID</td>
<td style="user-select: auto !important;">VARCHAR(N)</td>
<td style="user-select: auto !important;">Y</td>
<td style="user-select: auto !important;">N</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">FIRST_NAME</td>
<td style="user-select: auto !important;">VARCHAR(N)</td>
<td style="user-select: auto !important;">N</td>
<td style="user-select: auto !important;">Y</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">LAST_NAME</td>
<td style="user-select: auto !important;">VARCHAR(N)</td>
<td style="user-select: auto !important;">N</td>
<td style="user-select: auto !important;">Y</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">EMAIL</td>
<td style="user-select: auto !important;">VARCHAR(N)</td>
<td style="user-select: auto !important;">Y</td>
<td style="user-select: auto !important;">N</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">SKILL_CODE</td>
<td style="user-select: auto !important;">INTEGER</td>
<td style="user-select: auto !important;">N</td>
<td style="user-select: auto !important;">N</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto !important;">예를 들어 어떤 개발자의 <code style="user-select: auto !important;">SKILL_CODE</code>가 400 (=b'110010000')이라면, 이는 <code style="user-select: auto !important;">SKILLCODES</code> 테이블에서 CODE가 256 (=b'100000000'), 128 (=b'10000000'), 16 (=b'10000') 에 해당하는 스킬을 가졌다는 것을 의미합니다.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">문제</h5>

<p style="user-select: auto !important;"><code style="user-select: auto !important;">DEVELOPERS</code> 테이블에서 GRADE별 개발자의 정보를 조회하려 합니다. GRADE는 다음과 같이 정해집니다.</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">A : Front End 스킬과 Python 스킬을 함께 가지고 있는 개발자</li>
<li style="user-select: auto !important;">B : C# 스킬을 가진 개발자</li>
<li style="user-select: auto !important;">C : 그 외의 Front End 개발자</li>
</ul>

<p style="user-select: auto !important;">GRADE가 존재하는 개발자의 GRADE, ID, EMAIL을 조회하는 SQL 문을 작성해 주세요.</p>

<p style="user-select: auto !important;">결과는 GRADE와 ID를 기준으로 오름차순 정렬해 주세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">예시</h5>

<p style="user-select: auto !important;">예를 들어 <code style="user-select: auto !important;">SKILLCODES</code> 테이블이 다음과 같고,</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">NAME</th>
<th style="user-select: auto !important;">CATEGORY</th>
<th style="user-select: auto !important;">CODE</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">C++</td>
<td style="user-select: auto !important;">Back End</td>
<td style="user-select: auto !important;">4</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">JavaScript</td>
<td style="user-select: auto !important;">Front End</td>
<td style="user-select: auto !important;">16</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">Java</td>
<td style="user-select: auto !important;">Back End</td>
<td style="user-select: auto !important;">128</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">Python</td>
<td style="user-select: auto !important;">Back End</td>
<td style="user-select: auto !important;">256</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">C#</td>
<td style="user-select: auto !important;">Back End</td>
<td style="user-select: auto !important;">1024</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">React</td>
<td style="user-select: auto !important;">Front End</td>
<td style="user-select: auto !important;">2048</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">Vue</td>
<td style="user-select: auto !important;">Front End</td>
<td style="user-select: auto !important;">8192</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">Node.js</td>
<td style="user-select: auto !important;">Back End</td>
<td style="user-select: auto !important;">16384</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto !important;"><code style="user-select: auto !important;">DEVELOPERS</code> 테이블이 다음과 같다면</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">ID</th>
<th style="user-select: auto !important;">FIRST_NAME</th>
<th style="user-select: auto !important;">LAST_NAME</th>
<th style="user-select: auto !important;">EMAIL</th>
<th style="user-select: auto !important;">SKILL_CODE</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">D165</td>
<td style="user-select: auto !important;">Jerami</td>
<td style="user-select: auto !important;">Edwards</td>
<td style="user-select: auto !important;"><code style="user-select: auto !important;">jerami_edwards@grepp.co</code></td>
<td style="user-select: auto !important;">400</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">D161</td>
<td style="user-select: auto !important;">Carsen</td>
<td style="user-select: auto !important;">Garza</td>
<td style="user-select: auto !important;"><code style="user-select: auto !important;">carsen_garza@grepp.co</code></td>
<td style="user-select: auto !important;">2048</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">D164</td>
<td style="user-select: auto !important;">Kelly</td>
<td style="user-select: auto !important;">Grant</td>
<td style="user-select: auto !important;"><code style="user-select: auto !important;">kelly_grant@grepp.co</code></td>
<td style="user-select: auto !important;">1024</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">D163</td>
<td style="user-select: auto !important;">Luka</td>
<td style="user-select: auto !important;">Cory</td>
<td style="user-select: auto !important;"><code style="user-select: auto !important;">luka_cory@grepp.co</code></td>
<td style="user-select: auto !important;">16384</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">D162</td>
<td style="user-select: auto !important;">Cade</td>
<td style="user-select: auto !important;">Cunningham</td>
<td style="user-select: auto !important;"><code style="user-select: auto !important;">cade_cunningham@grepp.co</code></td>
<td style="user-select: auto !important;">8452</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto !important;">다음과 같이 <code style="user-select: auto !important;">DEVELOPERS</code> 테이블에 포함된 개발자들의 GRADE 및 정보가 결과에 나와야 합니다.</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">GRADE</th>
<th style="user-select: auto !important;">ID</th>
<th style="user-select: auto !important;">EMAIL</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">A</td>
<td style="user-select: auto !important;">D162</td>
<td style="user-select: auto !important;"><code style="user-select: auto !important;">cade_cunningham@grepp.co</code></td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">A</td>
<td style="user-select: auto !important;">D165</td>
<td style="user-select: auto !important;"><code style="user-select: auto !important;">jerami_edwards@grepp.co</code></td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">B</td>
<td style="user-select: auto !important;">D164</td>
<td style="user-select: auto !important;"><code style="user-select: auto !important;">kelly_grant@grepp.co</code></td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">C</td>
<td style="user-select: auto !important;">D161</td>
<td style="user-select: auto !important;"><code style="user-select: auto !important;">carsen_garza@grepp.co</code></td>
</tr>
</tbody>
      </table>

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges