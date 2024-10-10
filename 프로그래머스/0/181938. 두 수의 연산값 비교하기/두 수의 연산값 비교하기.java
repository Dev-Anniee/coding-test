class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int plus = Integer.parseInt(a+""+b);
        int multi = a*b*2;
        answer = Math.max(plus,multi);
        return answer;
    }
}