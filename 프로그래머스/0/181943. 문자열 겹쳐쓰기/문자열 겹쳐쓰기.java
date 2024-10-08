class Solution {
    public String solution(String my_string, String overwrite_string, int s) {

        char[] answer = new char[my_string.length()];
        answer = my_string.toCharArray();
        for(int i =0; i<overwrite_string.length(); i++) {
            answer[s] = overwrite_string.charAt(i);
            s++;
        }
        return new String(answer);
    }
}