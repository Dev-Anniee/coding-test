import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        int[][] arr = new int[n][m];
        int x = 0, y = 0;
        int dirNum = 0;

        for (int i = 1; i <= n * m; i++) {
            arr[x][y] = i;

            int nx = x + dx[dirNum];
            int ny = y + dy[dirNum];

            if (nx < 0 || nx >= n || ny < 0 || ny >= m || arr[nx][ny] != 0) {
                dirNum = (dirNum + 1) % 4;

                nx = x + dx[dirNum];
                ny = y + dy[dirNum];
            }

            x = nx;
            y = ny;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}