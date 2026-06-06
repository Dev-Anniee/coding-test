import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        for (int i = 0; i <= discount.length - 10; i++) {
            Map<String, Integer> map = new HashMap<>();

            for (int k = 0; k < want.length; k++) {
                map.put(want[k], number[k]);
            }

            for (int j = 0; j < 10; j++) {
                String item = discount[i + j];

                if (map.containsKey(item)) {
                    map.put(item, map.get(item) - 1);
                }
            }

            boolean isZero = true;

            for (int value : map.values()) {
                if (value != 0) {
                    isZero = false;
                    break;
                }
            }

            if (isZero) {
                answer++;
            }
        }

        return answer;
    }
}