import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

class Solution {
    public int[] solution(int[] answers) {
        // 각 수포자의 찍기 패턴 정의
        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        // 수포자들의 점수를 저장할 배열
        int[] scores = new int[3];
        
        // 정답 채점 (나머지 연산을 이용해 패턴 반복)
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == p1[i % p1.length]) scores[0]++;
            if (answers[i] == p2[i % p2.length]) scores[1]++;
            if (answers[i] == p3[i % p3.length]) scores[2]++;
        }
        
        // 가장 높은 점수 구하기
        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));
        
        // 최고점을 받은 수포자 번호를 담을 리스트
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (scores[i] == maxScore) {
                list.add(i + 1); // 수포자 번호는 1번부터 시작하므로 i + 1
            }
        }
        
        // List를 정수 배열(int[])로 변환하여 반환
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}