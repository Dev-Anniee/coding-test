import java.util.Arrays;

class Solution {
    public String[] solution(String[] str_list) {
        int flag = 0;
        int idx =0;
        String[] answer = {};
        
        for(int i=0; i<str_list.length; i++){
            if("l".equals(str_list[i])){
                flag=1;
                idx=i;
                break;
            }
            else if("r".equals(str_list[i])){
                flag=-1;
                idx=i;
                break;
            }
        }
        
        if (flag == 1 && idx > 0) {
            return Arrays.copyOfRange(str_list, 0, idx);
        } else if (flag == -1 && idx < str_list.length - 1) {
            return Arrays.copyOfRange(str_list, idx + 1, str_list.length);
        } else {
            return new String[0];
        }
    }
}