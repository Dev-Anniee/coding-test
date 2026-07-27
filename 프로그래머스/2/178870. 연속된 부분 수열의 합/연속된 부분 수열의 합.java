class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = {0, sequence.length};
        int left=0, right =0;
        int sum = 0;
        
        while (left<=right && right<sequence.length){
            sum+=sequence[right];
           
            while(sum>k)
                sum-=sequence[left++];
            
            if(sum==k){
                if(right-left<answer[1]-answer[0]){
                    answer[0] = left; answer[1] = right;
                }
            }
           
            right++;
        }
        return answer;
    }
}