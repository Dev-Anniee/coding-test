# [Silver I] 알고리즘 수업 - 점근적 표기 5 - 24369 

[문제 링크](https://www.acmicpc.net/problem/24369) 

### 성능 요약

메모리: 14240 KB, 시간: 104 ms

### 분류

수학, 많은 조건 분기

### 제출 일자

2026년 3월 20일 22:29:03

### 문제 설명

<p style="user-select: auto !important;">오늘도 서준이는 점근적 표기 수업 조교를 하고 있다. 아빠가 수업한 내용을 학생들이 잘 이해했는지 문제를 통해서 확인해보자.</p>

<p style="user-select: auto !important;">알고리즘의 소요 시간을 나타내는 Ω-표기법(빅-오메가)을 다음과 같이 정의한다.</p>

<p style="user-select: auto !important;">Ω(<em style="user-select: auto !important;">g</em>(<em style="user-select: auto !important;">n</em>)) = {<em style="user-select: auto !important;">f</em>(<em style="user-select: auto !important;">n</em>) | 모든 <em style="user-select: auto !important;">n</em> ≥ <em style="user-select: auto !important;">n<sub style="user-select: auto !important;">0</sub></em>에 대하여 <em style="user-select: auto !important;">c</em> × <em style="user-select: auto !important;">g</em>(<em style="user-select: auto !important;">n</em>) ≤ <em style="user-select: auto !important;">f</em>(<em style="user-select: auto !important;">n</em>)인 양의 상수 <em style="user-select: auto !important;">c</em>와 <em style="user-select: auto !important;">n<sub style="user-select: auto !important;">0</sub></em>가 존재한다}</p>

<p style="user-select: auto !important;">이 정의는 실제 Ω-표기법(<a href="https://en.wikipedia.org/wiki/Big_O_notation" style="user-select: auto !important;">https://en.wikipedia.org/wiki/Big_O_notation</a>)과 다를 수 있다.</p>

<p style="user-select: auto !important;">함수 <em style="user-select: auto !important;">f</em>(<em style="user-select: auto !important;">n</em>) = <em style="user-select: auto !important;">a<sub style="user-select: auto !important;">2</sub>n<sup style="user-select: auto !important;">2</sup> </em>+ <em style="user-select: auto !important;">a<sub style="user-select: auto !important;">1</sub>n </em>+ <em style="user-select: auto !important;">a<sub style="user-select: auto !important;">0</sub></em>, 양의 정수 <em style="user-select: auto !important;">c</em>, <em style="user-select: auto !important;">n<sub style="user-select: auto !important;">0</sub></em>가 주어질 경우 Ω(<em style="user-select: auto !important;">n<sup style="user-select: auto !important;">2</sup></em>) 정의를 만족하는지 알아보자.</p>

### 입력 

 <p style="user-select: auto !important;">첫째 줄에 함수 <em style="user-select: auto !important;">f</em>(<em style="user-select: auto !important;">n</em>)을 나타내는 정수 <em style="user-select: auto !important;">a<sub style="user-select: auto !important;">2</sub></em>, <em style="user-select: auto !important;">a<sub style="user-select: auto !important;">1</sub></em>, <em style="user-select: auto !important;">a</em><sub style="user-select: auto !important;"><em style="user-select: auto !important;">0</em></sub>가 주어진다. (0 ≤ |<em style="user-select: auto !important;">a<sub style="user-select: auto !important;">i</sub></em>| ≤ 100)</p>

<p style="user-select: auto !important;">다음 줄에 양의 정수 <em style="user-select: auto !important;">c</em>가 주어진다. (1 ≤ <em style="user-select: auto !important;">c</em> ≤ 100)</p>

<p style="user-select: auto !important;">다음 줄에 양의 정수 <em style="user-select: auto !important;">n<sub style="user-select: auto !important;">0</sub></em>가 주어진다. (1 ≤ <em style="user-select: auto !important;">n<sub style="user-select: auto !important;">0</sub></em> ≤ 100)</p>

### 출력 

 <p style="user-select: auto !important;"><em style="user-select: auto !important;">f</em>(<em style="user-select: auto !important;">n</em>), <em style="user-select: auto !important;">c</em>, <em style="user-select: auto !important;">n<sub style="user-select: auto !important;">0</sub></em>가 Ω(<em style="user-select: auto !important;">n<sup style="user-select: auto !important;">2</sup></em>) 정의를 만족하면 1, 아니면 0을 출력한다.</p>

