import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        int n = operations.length;
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        
        for(int i=0; i<n; i++){
            String[] parts = operations[i].split(" ");
            if(parts[0].equals("I")){
                int tmp = Integer.parseInt(parts[1]);
                treeMap.put(tmp,treeMap.getOrDefault(tmp,0)+1);
            }
            
            else if(!treeMap.isEmpty() && parts[0].equals("D")){
                if(parts[1].equals("1")){
                    int maxK = treeMap.lastKey();
                    int count = treeMap.get(maxK);
                    if(count==1)
                        treeMap.remove(maxK);
                    else
                        treeMap.put(maxK, count-1);
                }
                
                if(parts[1].equals("-1")){
                    int minK = treeMap.firstKey();
                    int count = treeMap.get(minK);
                    if(count==1)
                        treeMap.remove(minK);
                    else
                        treeMap.put(minK, count-1);
                }
            }
        }
        
        if(treeMap.isEmpty())
            return new int[]{0,0};
        else
            return new int[]{treeMap.lastKey(), treeMap.firstKey()};
    }
}