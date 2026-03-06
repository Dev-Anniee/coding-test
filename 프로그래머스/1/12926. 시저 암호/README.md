# [level 1] 시저 암호 - 12926 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12926) 

### 성능 요약

메모리: 85.2 MB, 시간: 2.38 ms

### 구분

코딩테스트 연습 > 연습문제

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 03월 06일 16:14:58

### 문제 설명

<p style="user-select: auto !important;">어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.  예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다. 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.</p>

<h5 style="user-select: auto !important;">제한 조건</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">공백은 아무리 밀어도 공백입니다.</li>
<li style="user-select: auto !important;">s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.</li>
<li style="user-select: auto !important;">s의 길이는 8000이하입니다.</li>
<li style="user-select: auto !important;">n은 1 이상, 25이하인 자연수입니다.</li>
</ul>

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">s</th>
<th style="user-select: auto !important;">n</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"AB"</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">"BC"</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"z"</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">"a"</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"a B z"</td>
<td style="user-select: auto !important;">4</td>
<td style="user-select: auto !important;">"e F d"</td>
</tr>
</tbody>
      </table>

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges