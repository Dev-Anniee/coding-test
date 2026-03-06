class Solution {
    public boolean solution(String s) {
        int l = s.length();
        if (l != 4 && l != 6) {
            return false;
        }

        for (int i = 0; i < l; i++) {
            int val = s.charAt(i) - '0';
            if (val < 0 || val > 9) {
                return false;
            }
        }
        return true;
    }
}