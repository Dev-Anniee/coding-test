import java.util.*;
class Solution {
    public int solution(String[][] book_time) {
        List<int[]> list = new ArrayList<>();
        
        int n = book_time.length;
        for(int i=0; i<n; i++){
            String[] part1 = book_time[i][0].split(":");
            String[] part2 = book_time[i][1].split(":");
            
            int start = Integer.parseInt(part1[0])*60+Integer.parseInt(part1[1]); // 예약 시작 시간
            int end = Integer.parseInt(part2[0])*60+Integer.parseInt(part2[1])+10; //예약 끝 시간
            list.add(new int[]{start,end}); 
        }
        
        list.sort((a,b) -> Integer.compare(a[0], b[0])); // 시작 시간을 기준으로 sort
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();    
        for(int[] time : list){
            if(!pq.isEmpty() && pq.peek()<=time[0]) 
            //pq가 비지 않았거나, 새로 들어오는 예약의 시작 시간이 기존 예약의 끝 시간보다 크거나 같을 때  
                pq.poll();
        
            pq.offer(time[1]); // 예약 끝 시간 집어 넣기
        }
        
        return pq.size();
    }
}