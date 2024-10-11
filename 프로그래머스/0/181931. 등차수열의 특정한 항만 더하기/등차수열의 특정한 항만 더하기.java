class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int [] arr = new int[100];
        for(int i =0; i<included.length; i++){
            arr[i] = a+(d*i);
        }
        for (int i=0; i<included.length; i++){
            if(included[i])
                answer+=arr[i];
        }
        return answer;
    }
}