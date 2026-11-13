import java.util.*;

class Solution {
    public String[] solution(String[][] plans) {
        int n = plans.length;
        List<String[]> list = new ArrayList<>();
        
        // 1. 데이터를 변환하고 리스트에 추가 (시간을 분 단위로 통일)
        for(int i = 0; i < n; i++){
            String subject = plans[i][0];
            String[] time = plans[i][1].split(":");
            int startTime = Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);
            String spendTime = plans[i][2];

            list.add(new String[]{subject, String.valueOf(startTime), spendTime});
        }
        
        // 2. 시작 시간 기준으로 오름차순 정렬
        list.sort((a, b) -> Integer.parseInt(a[1]) - Integer.parseInt(b[1]));
        
        // 3. 과제 진행 로직 준비
        Stack<String[]> st = new Stack<>(); // 멈춘 과제를 담을 스택
        String[] answer = new String[n];    // 크기가 n으로 고정된 정답 배열
        int idx = 0;                        // 배열에 값을 채워넣을 인덱스
        
        // 4. 마지막 과제 전까지 반복 (현재 과제와 다음 과제를 비교)
        for (int i = 0; i < n - 1; i++) {
            String[] current = list.get(i);
            String[] next = list.get(i + 1);
            
            int currentStart = Integer.parseInt(current[1]);
            int currentPlay = Integer.parseInt(current[2]);
            int nextStart = Integer.parseInt(next[1]);
            
            int endTime = currentStart + currentPlay; // 현재 과제가 끝나는 시간
            
            // 케이스 A: 현재 과제를 다음 과제 시작 전에 끝낼 수 있는 경우
            if (endTime <= nextStart) {
                answer[idx++] = current[0]; // 과제 완료!
                
                int freeTime = nextStart - endTime; // 다음 과제 시작 전까지 남는 시간
                
                // 잉여 시간이 있고, 스택에 멈춰둔 과제가 있다면 꺼내서 진행
                while (!st.isEmpty() && freeTime > 0) {
                    String[] pausedTask = st.pop();
                    int pausedPlay = Integer.parseInt(pausedTask[2]);
                    
                    if (pausedPlay <= freeTime) {
                        // 멈춘 과제를 완전히 끝낼 수 있는 경우
                        freeTime -= pausedPlay;
                        answer[idx++] = pausedTask[0];
                    } else {
                        // 멈춘 과제를 다 못 끝내는 경우 (시간만 차감하고 다시 스택으로)
                        pausedTask[2] = String.valueOf(pausedPlay - freeTime);
                        st.push(pausedTask);
                        freeTime = 0; // 자투리 시간 소진
                    }
                }
            } 
            // 케이스 B: 시간이 부족해서 현재 과제를 멈춰야 하는 경우
            else {
                int workedTime = nextStart - currentStart; // 지금까지 일한 시간
                current[2] = String.valueOf(currentPlay - workedTime); // 남은 시간 갱신
                st.push(current); // 스택에 잠시 보관
            }
        }
        
        // 5. 마지막 남은 새 과제는 중단될 일이 없으므로 바로 완료 처리
        answer[idx++] = list.get(n - 1)[0];
        
        // 6. 모든 새 과제를 순회했으니, 스택에 남아있는 과제들을 멈춘 순서대로 완료
        while (!st.isEmpty()) {
            answer[idx++] = st.pop()[0];
        }
        
        return answer;
    }
}