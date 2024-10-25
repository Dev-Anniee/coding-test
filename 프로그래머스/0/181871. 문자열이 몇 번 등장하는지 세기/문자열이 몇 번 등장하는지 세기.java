class Solution {
    public int solution(String myString, String pat) {
        int index = 0;
        int answer =0;
        while(true){
            index = myString.indexOf(pat);
            myString = myString.substring(index+1);
            if(index ==-1)
                break;
            answer++;
       }

        return answer;
    }
}