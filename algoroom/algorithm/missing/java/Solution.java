class Solution {
    public int solution(int n, int[] numbers) {
        int sum = (int)n*(n+1)/2;
        for(int i=0; i<numbers.length; i++){
            sum-=numbers[i];
        }
        return sum;
    }
}
