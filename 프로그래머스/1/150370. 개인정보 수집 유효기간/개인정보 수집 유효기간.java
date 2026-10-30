import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {

        int n = privacies.length;
        List<Integer> list = new ArrayList<>();

        // 오늘 날짜를 일수로 변환
        String[] t = today.split("\\.");

        int todayTotal = Integer.parseInt(t[0]) * 12 * 28
                       + Integer.parseInt(t[1]) * 28
                       + Integer.parseInt(t[2]);

        for(int i = 0; i < n; i++) {

            String[] parts = privacies[i].split(" ");
            String[] date = parts[0].split("\\.");

            // 개인정보 수집 날짜
            int total = Integer.parseInt(date[0]) * 12 * 28
                      + Integer.parseInt(date[1]) * 28
                      + Integer.parseInt(date[2]);

            for(int j = 0; j < terms.length; j++) {

                String[] term = terms[j].split(" ");

                if(term[0].equals(parts[1])) {

                    int month = Integer.parseInt(term[1]);

                    // 유효기간이 끝난 다음 날
                    int expire = total + month * 28;

                    if(expire <= todayTotal) {
                        list.add(i + 1);
                    }

                    break;
                }
            }
        }

        int[] answer = new int[list.size()];

        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}