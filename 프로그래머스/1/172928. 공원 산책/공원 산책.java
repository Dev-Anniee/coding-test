class Solution {
    public int[] solution(String[] park, String[] routes) {

        int rows = park.length;
        int cols = park[0].length();

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        int curX = 0;
        int curY = 0;

        // 시작 위치 찾기
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (park[i].charAt(j) == 'S') {
                    curX = j;
                    curY = i;
                }
            }
        }

        for (String route : routes) {
            String[] parts = route.split(" ");
            String direction = parts[0];
            int steps = Integer.parseInt(parts[1]);

            int dir = 0;

            if (direction.equals("E")) dir = 0;
            else if (direction.equals("W")) dir = 1;
            else if (direction.equals("S")) dir = 2;
            else if (direction.equals("N")) dir = 3;

            int x = curX;
            int y = curY;
            boolean valid = true;

            for (int j = 0; j < steps; j++) {
                int nx = x + dx[dir];
                int ny = y + dy[dir];

                if (nx < 0 || ny < 0 || nx >= cols || ny >= rows
                        || park[ny].charAt(nx) == 'X') {
                    valid = false;
                    break;
                }

                x = nx;
                y = ny;
            }

            if (valid) {
                curX = x;
                curY = y;
            }
        }

        return new int[]{curY, curX};
    }
}