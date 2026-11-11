import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> list = new ArrayList<>();
        // 1. today를 총 일수로 환산 (이때 모든 달은 28일)
        String[] todays = today.split("\\.");
        int total_days = Integer.parseInt(todays[0])*12*28 + Integer.parseInt(todays[1])*28 + Integer.parseInt(todays[2]);
        System.out.println("오늘 날짜 : " + total_days);
        
        int n = terms.length;
        int m = privacies.length;
        // 2.  terms도 약관 제목과, 개인정보 수집 일자 split 후 총 일수로 계산
        for(int i=0; i<m; i++){
            String[] privacy = privacies[i].split(" ");
            String[] privacy_day = privacy[0].split("\\.");
            int privacy_total_days = Integer.parseInt(privacy_day[0])*12*28+ Integer.parseInt(privacy_day[1])*28 + Integer.parseInt(privacy_day[2]);
            System.out.println("약관 최초 날짜 : " + privacy_total_days);
            
            //3. 약간 유효기간 더해주기
            for(int j=0; j<n; j++){
                String[] term = terms[j].split(" ");
                int term_total_days = Integer.parseInt(term[1])*28;
                if(term[0].equals(privacy[1]))
                    privacy_total_days +=term_total_days;
            }
            System.out.println("약관 더한 날짜 : " + privacy_total_days);
            if(privacy_total_days<=total_days)
                list.add(i+1);
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}