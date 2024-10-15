class Solution {
    public static int solution(int[] num_list) {
        int answer = 0;
        String ever = "";
        String odd = "";
        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2==0)
                ever += (num_list[i] + "");
            else
                odd += (num_list[i] + "");

        }
        answer+=Integer.parseInt(ever);
        answer+=Integer.parseInt(odd);
        return answer;
        }
}
    