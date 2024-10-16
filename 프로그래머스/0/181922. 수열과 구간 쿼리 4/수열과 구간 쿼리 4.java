class Solution {
    public static int[] solution(int[] arr, int[][] queries) {
        int []answer = new int[arr.length];
        answer=arr.clone();
        for (int i=0; i<queries.length; i++){
            for(int j= queries[i][0]; j<=queries[i][1]; j++){
                if(j%queries[i][2]==0){
                    answer[j]+=1;
                }
            }
        }
        return answer;
    }
}