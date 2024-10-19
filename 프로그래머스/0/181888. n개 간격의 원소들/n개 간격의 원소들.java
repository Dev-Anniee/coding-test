class Solution {
    public int[] solution(int[] num_list, int n) {
        int answer_length=0;
        if(num_list.length%n==0)
            answer_length = num_list.length/n;
        else
            answer_length = num_list.length/n+1;
        
        int[] answer = new int [answer_length];
        for(int i=0; i<answer_length; i++){
            answer[i]=num_list[i*n];
        }

        return answer;
    }
}