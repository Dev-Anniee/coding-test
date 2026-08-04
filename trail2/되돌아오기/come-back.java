import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        
        int x = 0;
        int y = 0;
        int time = 0;
        
        for (int i = 0; i < num; i++) {
            String[] parts = br.readLine().split(" ");
            char dir = parts[0].charAt(0);
            int dist = Integer.parseInt(parts[1]);
            
            for (int j = 0; j < dist; j++) {
                if (dir == 'N') y++;
                else if (dir == 'S') y--;
                else if (dir == 'E') x++;
                else if (dir == 'W') x--;
                

                time++;
                
                if (x == 0 && y == 0) {
                    System.out.println(time);
                    return; 
                }
            }
        }
        System.out.println(-1);
    }
}