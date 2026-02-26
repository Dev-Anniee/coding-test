class Solution {
    public int[] solution(int n) {
        int [][] stair = new int[n][n];
        int num = n*(n+1)/2;
        int[] answer = new int[num];
        
        int row =-1, col=0;
        int start =1;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(i%3==0) row++;
                else if (i%3==1) col++;
                else{
                    row--;
                    col--;
                }
                stair[row][col] = start++;
            }
        }
        
        int index = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                answer[index++]=stair[i][j];
            }
        }
        return answer;
    }
}