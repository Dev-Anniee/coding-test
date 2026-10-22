import java.util.*;
class Solution {
    public int[] solution(int[] fees, String[] records) {
        //fees - 1. 기본시간 2. 기본 요금 3. 단위 시간 4. 단위 요금
        //records - 1. 입차 시간 2. 번호 3. 입차 or 출차
        
        Map<String, Integer> tmpTimeMap = new TreeMap<>(); 
        Map<String, Integer> totalTimeMap = new TreeMap<>();
        
        for(int i=0; i<records.length; i++){
            String[] parts = records[i].split(" ");
            String time = parts[0];
            String car = parts[1];
            String status = parts[2];
            
            String[] times = time.split(":");
            int minutes = Integer.parseInt(times[0])*60 + Integer.parseInt(times[1]);
            
            if(status.equals("IN"))
                tmpTimeMap.put(car, minutes);
            
            else{
                int inTime = tmpTimeMap.get(car);
                int parkedTime = minutes - inTime;
                totalTimeMap.put(car, totalTimeMap.getOrDefault(car, 0) + parkedTime);
                tmpTimeMap.remove(car);
            }        
        }
        // TODO: 1. 기록이 끝나도 inTimeMap에 남아있는(출차 안 한) 차량 23:59 일괄 출차 처리
        // TODO: 2. 차량 번호 오름차순으로 정렬 후 요금 계산
        int last = 23*60+59;
        for(String car : tmpTimeMap.keySet()){
            int parkedTime = last - tmpTimeMap.get(car);
            totalTimeMap.put(car, totalTimeMap.getOrDefault(car,0)+parkedTime);
        }
        int[] answer = new int[totalTimeMap.size()];
        int index = 0;
        for(String car : totalTimeMap.keySet()){
            int totalTime = totalTimeMap.get(car);
            if(totalTime < fees[0]){
                answer[index] = fees[1];
            }else{
                double extraTime = totalTime - fees[0];
                int extraFee = (int) Math.ceil(extraTime / fees[2]) * fees[3];
                answer[index] = fees[1] + extraFee;
            }
            index++;
        }
        return answer;
    }
}