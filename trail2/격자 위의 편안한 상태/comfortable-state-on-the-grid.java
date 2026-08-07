import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        boolean[][] arr = new boolean[n][n];

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};

        for (int i = 0; i < m; i++) {
            int r = sc.nextInt() - 1;
            int c = sc.nextInt() - 1;
            arr[r][c] = true;

            int count = 0;
            
            for (int k = 0; k < 4; k++) {
                int nx = r + dx[k];
                int ny = c + dy[k];
                
                if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
                    if (arr[nx][ny]) {
                        count++;
                    }
                }
            }
            
            if (count == 3) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
        
        sc.close();
    }
}