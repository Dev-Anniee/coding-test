import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        List<Integer> list= new ArrayList<>();
        
        for(int i=0; i<my_string.length(); i++){
            if('0'<=my_string.charAt(i) && '9'>=my_string.charAt(i))
               list.add(my_string.charAt(i)-'0');
        }
        
        int[] my_char = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            my_char[i] = list.get(i);
        }
        
        Arrays.sort(my_char);
        return my_char;
    }
}