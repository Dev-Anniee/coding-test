import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = {};
        int n = operations.length;
        
        //값, 개수
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i=0; i<n; i++){
            String[] parts = operations[i].split(" ");
            if(parts[0].equals("I")){
                int num = Integer.parseInt(parts[1]);
                map.put(num,map.getOrDefault(num,0)+1);
            }
            
            if(!map.isEmpty() && parts[0].equals("D")){
                if(parts[1].equals("1")){
                    int maxKey = map.lastKey();
                    int count = map.get(maxKey);
                    
                    if(count == 1)
                        map.remove(maxKey);
                    else
                        map.put(maxKey, count-1);
                }
                                
                    if(parts[1].equals("-1")){
                    int minKey = map.firstKey();
                    int count = map.get(minKey);
                    
                    if(count == 1)
                        map.remove(minKey);
                    else
                        map.put(minKey, count-1);
                }
                    
            }
        }
        if (map.isEmpty()) {
            return new int[]{0, 0};
        } else {
            return new int[]{map.lastKey(), map.firstKey()};
        }
    }
}