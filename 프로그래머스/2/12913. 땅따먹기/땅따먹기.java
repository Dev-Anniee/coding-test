import java.util.Arrays;

class Solution {
    int solution(int[][] land) {
        // 1번째 행부터 마지막 행까지 내려가며 최댓값을 누적합니다.
        for (int i = 1; i < land.length; i++) {
            // 현재 행의 0번째 칸 = 이전 행의 1, 2, 3번째 칸 중 최댓값 + 현재 칸의 값
            land[i][0] += Math.max(land[i-1][1], Math.max(land[i-1][2], land[i-1][3]));
            
            // 현재 행의 1번째 칸 = 이전 행의 0, 2, 3번째 칸 중 최댓값 + 현재 칸의 값
            land[i][1] += Math.max(land[i-1][0], Math.max(land[i-1][2], land[i-1][3]));
            
            // 현재 행의 2번째 칸 = 이전 행의 0, 1, 3번째 칸 중 최댓값 + 현재 칸의 값
            land[i][2] += Math.max(land[i-1][0], Math.max(land[i-1][1], land[i-1][3]));
            
            // 현재 행의 3번째 칸 = 이전 행의 0, 1, 2번째 칸 중 최댓값 + 현재 칸의 값
            land[i][3] += Math.max(land[i-1][0], Math.max(land[i-1][1], land[i-1][2]));
        }

        // 마지막 행의 4개 값 중 가장 큰 값을 찾아서 반환합니다.
        int lastRowIndex = land.length - 1;
        return Math.max(
            Math.max(land[lastRowIndex][0], land[lastRowIndex][1]),
            Math.max(land[lastRowIndex][2], land[lastRowIndex][3])
        );
    }
}