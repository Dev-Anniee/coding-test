import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        // 1. 중요도가 높은 순서대로 나오는 우선순위 큐 생성 (내림차순)
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        // 2. 큐에 모든 중요도 숫자를 넣습니다. (알아서 정렬됨)
        for (int p : priorities) {
            pq.offer(p);
        }
        
        int answer = 0; // 몇 번째로 실행되는지 기록
        
        // 3. 우선순위 큐가 빌 때까지 계속 반복
        while (!pq.isEmpty()) {
            
            // 기존 priorities 배열의 처음부터 끝까지 순서대로 훑어보기 (큐에서 꺼냈다 뒤로 보내는 과정을 for문으로 대체)
            for (int i = 0; i < priorities.length; i++) {
                
                // 대기 중인 문서들 중 가장 높은 중요도(pq.peek())가 현재 배열 위치의 중요도(priorities[i])와 같다면 실행
                if (priorities[i] == pq.peek()) {
                    pq.poll(); // 큐에서 제거 (1회 실행을 의미)
                    answer++;  // 실행 순서 카운트 1 증가
                    
                    // 방금 실행한 문서의 원래 위치(i)가 우리가 찾고 있던 location과 같다면 정답 반환
                    if (i == location) {
                        return answer;
                    }
                }
            }
        }
        
        return answer;
    }
}