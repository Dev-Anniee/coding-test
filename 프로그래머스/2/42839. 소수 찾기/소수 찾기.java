import java.util.HashSet;

class Solution {
    
    // 백트래킹을 이용한 숫자 조합 생성 함수
    private void generate(String numbers, boolean[] visited, String madeNum, HashSet<Integer> numSet) {
        // 1. 조립된 문자열이 비어있지 않다면 정수로 변환하여 바구니(Set)에 추가
        if (!madeNum.equals("")) {
            numSet.add(Integer.parseInt(madeNum));
        }
        
        // 2. 남은 숫자 카드를 돌아가며 확인
        for (int i = 0; i < numbers.length(); i++) {
            if (!visited[i]) {
                visited[i] = true; // [DO] 사용 표시 (스티커 붙이기)
                generate(numbers, visited, madeNum + numbers.charAt(i), numSet); // [RECURSE] 이어 붙이고 다음 깊이로 이동
                visited[i] = false; // [UNDO] 원상 복구 (스티커 떼기)
            }
        }
    }
    
    // 소수 판별 함수
    private boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        
        // 제곱근까지만 확인하여 시간 복잡도를 줄임
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
    
    // 메인 솔루션 함수
    public int solution(String numbers) {
        HashSet<Integer> numSet = new HashSet<>(); // 중복 방지용 Set
        boolean[] visited = new boolean[numbers.length()]; // 방문 체크 배열 준비
        
        // 탐색 시작 (초기 상태: 만들어진 숫자 없음)
        generate(numbers, visited, "", numSet);
        
        int answer = 0;
        // 완성된 숫자들 중 소수의 개수 세기
        for (int num : numSet) {
            if (isPrime(num)) {
                answer++;
            }
        }
        
        return answer;
    }
}