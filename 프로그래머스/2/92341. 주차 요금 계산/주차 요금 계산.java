import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        int basicTime = fees[0];
        int basicFee = fees[1];
        int unitTime = fees[2];
        int unitFee = fees[3];
        
        Map<String, Integer> totalTimeMap = new TreeMap<>();
        Map<String, Integer> inTimeMap = new HashMap<>();
        
        for(String record : records){
            String[] parts = record.split(" ");
            int time = parseTime(parts[0]);
            String carNum = parts[1];
            String status = parts[2];
            
            if(status.equals("IN")){
                inTimeMap.put(carNum, time);
            } else if(status.equals("OUT")){
                int inTime = inTimeMap.remove(carNum);
                int parkedTime = time - inTime; 
                totalTimeMap.put(carNum, totalTimeMap.getOrDefault(carNum, 0) + parkedTime);
            }
        }
        
        int endOfday = parseTime("23:59");
        for(Map.Entry<String, Integer> entry : inTimeMap.entrySet()){
            String carNum = entry.getKey();
            int inTime = entry.getValue();
            int parkedTime = endOfday - inTime; 
            totalTimeMap.put(carNum, totalTimeMap.getOrDefault(carNum, 0) + parkedTime);
        }
        
        int[] answer = new int[totalTimeMap.size()];
        int idx = 0;
        
        for (int totalTime : totalTimeMap.values()) {
            if (totalTime <= basicTime) {
                answer[idx++] = basicFee;
            } else {
                int extraTime = totalTime - basicTime;
                int extraFee = (int) Math.ceil((double) extraTime / unitTime) * unitFee;
                answer[idx++] = basicFee + extraFee;
            }
        }
        return answer;
    }
    
    private int parseTime(String timeStr){
        String[] parts = timeStr.split(":"); 
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);
        return hour * 60 + minute;
    }
}