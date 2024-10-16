import java.util.*;
class Solution {
    public String solution(String my_string, int[][] queries) {
        char [] str = my_string.toCharArray();
        for (int i = 0; i< queries.length; i++) {
            int first = queries[i][0];
            int last = queries[i][1];
            while(first < last) {
                char tmp = str[first];
                str[first] = str[last];
                str[last] = tmp;
                first++; last--;
            }
        }
        return new String(str);
    }
}    