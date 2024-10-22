class Solution {
    public String solution(String myString, String pat) {
            int place = myString.lastIndexOf(pat);
        return myString.substring(0,place+pat.length());
    }
}