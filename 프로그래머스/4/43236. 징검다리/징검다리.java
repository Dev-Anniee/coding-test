import java.util.*;

class Solution {
    public int solution(int distance, int[] rocks, int n) {
        Arrays.sort(rocks);

        int[] arr = new int[rocks.length + 1];

        for (int i = 0; i < rocks.length; i++) {
            arr[i] = rocks[i];
        }

        arr[rocks.length] = distance;

        int left = 1;
        int right = distance;
        int answer = 0;

        while (left <= right) {
            int mid = (left + right) / 2;

            int prev = 0;
            int removeCount = 0;

            for (int rock : arr) {
                int gap = rock - prev;

                if (gap < mid) {
                    removeCount++;
                } else {
                    prev = rock;
                }
            }

            if (removeCount > n) {
                right = mid - 1;
            } else {
                answer = mid;
                left = mid + 1;
            }
        }

        return answer;
    }
}