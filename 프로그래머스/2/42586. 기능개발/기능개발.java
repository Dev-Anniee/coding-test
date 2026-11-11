import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int n = progresses.length;
        Queue<Integer> spend = new LinkedList<>();
        List<Integer> deployCounts = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            // 계산된 일수 (예상 소요 날짜) 큐에 넣기
            int days = (100-progresses[i]+speeds[i]-1)/speeds[i];
            spend.offer(days);
        }
        
        int deployDay = spend.poll();
        int count =1;
        
        while(!spend.isEmpty()){
            if(deployDay>=spend.peek()){
                count++;
                spend.poll();
            }
            
            else{
                deployCounts.add(count);
                count = 1;
                deployDay = spend.poll();
            }
        }
        
        deployCounts.add(count);
        
        int[] answer = new int[deployCounts.size()];
        for(int i=0; i<deployCounts.size(); i++){
            answer[i] = deployCounts.get(i);
        }
        
        return answer;
    }
}