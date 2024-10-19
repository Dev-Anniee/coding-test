class Solution {
    public String[] solution(String[] str_list) {
        int flag = 0;
        int idx = 0;
        String[] answer = {};

        for (int i = 0; i < str_list.length; i++) {
            if ("l".equals(str_list[i])) {
                flag = 1;
                idx = i;
                break;
            } else if ("r".equals(str_list[i])) {
                flag = -1;
                idx = i;
                break;
            }
        }

        if (flag == 1) {
            answer = new String[idx]; 
            for (int i = 0; i < idx; i++) {
                answer[i] = str_list[i];  
            }
        } else if (flag == -1) {
            answer = new String[str_list.length - idx - 1]; 
            for (int i = idx+1; i < str_list.length ; i++) {
                answer[i - idx - 1] = str_list[i];
            }
        }
        else
            answer = new String[0];
            

        return answer;
    }}