import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        List<String> arr = new ArrayList<String>();
        for(int i=0; i<my_string.length(); i++){
            answer[i]=my_string.substring(my_string.length()-1-i);
            arr.add(answer[i]);
        }
        Collections.sort(arr);
        
        return arr.toArray(new String[arr.size()]);
    }
}