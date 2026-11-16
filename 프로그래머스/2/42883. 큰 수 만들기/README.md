# [level 2] 큰 수 만들기 - 42883 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/42883) 

### 성능 요약

메모리: 86.5 MB, 시간: 50.91 ms

### 구분

코딩테스트 연습 > 탐욕법（Greedy）

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 11월 16일 22:03:48

### 문제 설명

<p style="user-select: auto !important;">어떤 숫자에서 k개의 수를 제거했을 때 얻을 수 있는 가장 큰 숫자를 구하려 합니다.</p>

<p style="user-select: auto !important;">예를 들어, 숫자 1924에서 수 두 개를 제거하면 [19, 12, 14, 92, 94, 24] 를 만들 수 있습니다. 이 중 가장 큰 숫자는 94 입니다.</p>

<p style="user-select: auto !important;">문자열 형식으로 숫자 number와 제거할 수의 개수 k가 solution 함수의 매개변수로 주어집니다. number에서 k 개의 수를 제거했을 때 만들 수 있는 수 중 가장 큰 숫자를 문자열 형태로 return 하도록 solution 함수를 완성하세요.</p>

<h5 style="user-select: auto !important;">제한 조건</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">number는 2자리 이상, 1,000,000자리 이하인 숫자입니다.</li>
<li style="user-select: auto !important;">k는 1 이상 <code style="user-select: auto !important;">number의 자릿수</code> 미만인 자연수입니다.</li>
</ul>

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">number</th>
<th style="user-select: auto !important;">k</th>
<th style="user-select: auto !important;">return</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"1924"</td>
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">"94"</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"1231234"</td>
<td style="user-select: auto !important;">3</td>
<td style="user-select: auto !important;">"3234"</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"4177252841"</td>
<td style="user-select: auto !important;">4</td>
<td style="user-select: auto !important;">"775841"</td>
</tr>
</tbody>
      </table>

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges