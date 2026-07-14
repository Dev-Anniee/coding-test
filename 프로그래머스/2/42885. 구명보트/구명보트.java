import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int answer = 0;
        int l =0; 
        int r =people.length-1;
        
        while (l<=r){
            if (l == r) {
                answer++;
                break;
            }
            if(people[r]+people[l]<=limit){
                l++; 
                r--;
            }
            else
                r--;
            answer++;
        
        }
        return answer;
    }
}