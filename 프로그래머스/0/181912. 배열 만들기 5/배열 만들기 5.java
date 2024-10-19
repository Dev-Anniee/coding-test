import java.util.ArrayList;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> answer = new ArrayList<>();
        int j=0;
        for(int i=0; i<intStrs.length; i++){
            int new_num = Integer.parseInt(intStrs[i].substring(s,s+l));
            if(new_num>k){
                answer.add(new_num); j++;}
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}