class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        int cnt =0;
        for(int i =0; i<my_string.length(); i++){
            if(i<s)
                answer+=my_string.charAt(i);
            else if(i<=e){
                answer+=my_string.charAt(e-cnt);
                cnt++;}
            else if(i>e)
                answer+=my_string.charAt(i);
        }
        return answer;
    }
}