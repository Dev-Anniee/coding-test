class Solution {
    public int solution(String dna) {
       if(dna.length() == 0) return 0;
        int answer =1;
        int cur = 1;
        
        for(int i=1; i<dna.length(); i++){
            if(dna.charAt(i)==dna.charAt(i-1))
                cur++;
            else 
                cur = 1;
            
            answer = Math.max(answer, cur);
        }
        return answer;
    }
}
