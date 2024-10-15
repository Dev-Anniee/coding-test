class Solution {
    public static int[] solution(int n) {
        String tmp =n+" ";
        while(n!=1){
            if(n%2==0)
                n=n/2;
            else
                n=3*n+1;
            tmp+=n+" ";
        }
        String[] arr = tmp.split(" ");
        int [] answer = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            answer[i] = Integer.parseInt(arr[i]);
        }
        return answer;
    }
}