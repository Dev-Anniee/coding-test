import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        Queue<Integer> bridge = new LinkedList<>();
        
        int truckIdx = 0; //대기중인 트럭을 가리킬 인덱스
        int currentWeight = 0; // 현재 다리 위에 있는 하중
        
        for(int i=0; i<bridge_length; i++){
            bridge.offer(0);
        }
        /*
        1. 다리 맨 앞 칸의 트럭을 큐에서 빼고 하중 계산
        2. 현재 무게 + 다음 무게가 버틸 수 있는 하중인지 계산하여
        -> 버틸 수 있다면 다음 트럭을 큐에 넣고 currentWeight 계산, idx증가
        -> 버틸 수 없다면 큐에 0을 넣는다 
        마지막 트럭이 다리에 갓 진입한 상태에서 while 문 종료되므로 마지막 트럭이 다리를  건너는 시간 더해준다
        */
        
        while(truckIdx < truck_weights.length){
            answer++;
            currentWeight-=bridge.poll();
            int truckWeight = truck_weights[truckIdx];
            if(currentWeight+truckWeight<=weight){
                bridge.offer(truckWeight);
                currentWeight+=truckWeight;
                truckIdx++;
            }
            else
                bridge.offer(0);
        }
        
        return answer + bridge_length;
    }
}