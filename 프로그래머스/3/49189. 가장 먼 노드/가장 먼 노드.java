import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        List<Integer>[] graph = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] e : edge) {
            int a = e[0];
            int b = e[1];

            graph[a].add(b);
            graph[b].add(a);
        }

        int[] distance = new int[n + 1];
        Arrays.fill(distance, -1);

        Queue<Integer> q = new LinkedList<>();
        distance[1] = 0;
        q.add(1);

        while (!q.isEmpty()) {
            int current = q.poll();

            for (int next : graph[current]) {
                if (distance[next] == -1) {
                    distance[next] = distance[current] + 1;
                    q.add(next);
                }
            }
        }

        int max = 0;
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (distance[i] > max) {
                max = distance[i];
                answer = 1;
            } else if (distance[i] == max) {
                answer++;
            }
        }

        return answer;
    }
}