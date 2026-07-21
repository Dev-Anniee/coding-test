import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        int dx=0, dy =0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for (int i =0; i<num; i++){
            String line = br.readLine();

            char dir = line.charAt(0);
            int dist = Integer.parseInt(line.substring(2));

            switch (dir) {
                case 'N':
                    dy += dist;
                    break;
                case 'S':
                    dy -= dist;
                    break;
                case 'E':
                    dx += dist;
                    break;
                case 'W':
                    dx -= dist;
                    break;
            }
        }
        System.out.println(dx+" "+dy);
    }
}