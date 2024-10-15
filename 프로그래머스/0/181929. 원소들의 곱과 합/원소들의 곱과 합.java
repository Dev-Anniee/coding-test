class Solution {
    public int solution(int[] num_list) {
        int case1= 1;
        int case2= 0;
        for(int i=0; i<num_list.length; i++){
            case1*= num_list[i];
            case2+= num_list[i];
        }
        
        if (case1>(case2*case2))
            return 0;
        
        else 
            return 1;
    }
}