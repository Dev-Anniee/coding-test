class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String num1 = a+""+b;
        String num2 = b+""+a;
        int c = Integer.parseInt(num1);
        int d = Integer.parseInt(num2);
        answer = Math.max(c, d);
        return answer;
    }
}
