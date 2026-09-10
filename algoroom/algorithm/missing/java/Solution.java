class Solution {
    public int solution(int n, int[] numbers) {
        int[] check = new int[n+1];

        for(int i=0; i<numbers.length; i++){
            check[numbers[i]] = 1;
        }

        for(int i=1; i<check.length; i++){
            if(check[i]!=1)
                return i;
        }
        return 0;
    }
}
