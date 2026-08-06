import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Set<String> reportSet = new HashSet<>(Arrays.asList(report));
        
        Map<String, List<String>> map = new HashMap<>();
        
        for(String r : reportSet){
            String[] tmp = r.split(" ");
            map.computeIfAbsent(tmp[1], x-> new ArrayList<>()).add(tmp[0]);
        }
        
        for(Map.Entry<String, List<String>> entry : map.entrySet()){
            if(entry.getValue().size()>=k){
                List<String> reporter = entry.getValue();
                
                for(int j=0; j<id_list.length; j++){
                    if(reporter.contains(id_list[j]))
                        answer[j]++;
                }
                
            }
        }
        
        return answer;
    }
}