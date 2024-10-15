class Solution {
    public int[] solution(int start_num, int end_num) {
        int space = end_num-start_num+1;
        int[] answer = new int[space];

        for(int i=0; i<space; i++){
            answer[i]= start_num;
            start_num++;
        }
        return answer;
    }
}