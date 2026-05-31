import java.util.*;

class Solution {
    public int[] solution(String[] gems) {
        Set<String> set = new HashSet<>(Arrays.asList(gems));
        int target = set.size();
        
        Map<String, Integer> map = new HashMap<>();
        
        int left= 0, right = 0;
        int start = 0, end = 0;
        int minLen = Integer.MAX_VALUE;
        
        while(right < gems.length){
            String gem = gems[right];
            map.put(gem, map.getOrDefault(gem,0)+1);
            right++;
            
            while(map.size()==target){
                // 여기서 현재 구간이 최소인지 확인
                int len = right - left;
                
                if (len < minLen) {
                    minLen = len;
                    start = left;
                    end = right - 1;
                }
                
                String leftGem = gems[left];
                map.put(leftGem, map.get(leftGem)-1);
                
                if(map.get(leftGem)==0){
                    map.remove(leftGem);
                }
                left++;
            }
        }
        return new int[]{start + 1, end + 1};
    }
}