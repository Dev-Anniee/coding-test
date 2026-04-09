import java.util.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int vertex = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());
        
        int[][] map = new int[vertex+1][vertex+1];
        boolean[] visited = new boolean[vertex+1];

        for(int i=0; i<edge; i++){
            st = new StringTokenizer(br.readLine());
            int a1 = Integer.parseInt(st.nextToken());
            int a2 = Integer.parseInt(st.nextToken());

            map[a1][a2] =1;
            map[a2][a1] =1;
        }

        dfs(map,visited,start);
        System.out.println();
        Arrays.fill(visited,false);
        bfs(map,visited,start);
    }

    public static void dfs(int[][] map, boolean[] visited, int s){
        visited[s] = true;
        System.out.print(s + " ");
        for(int i=0; i<visited.length; i++){
            if(map[s][i]==1 &&!visited[i])
                dfs(map,visited,i);
        }
    }

    public static void bfs(int[][] map, boolean[] visited, int s){
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        visited[s] = true;

        while(!q.isEmpty()){
            s = q.poll();
            System.out.print(s + " ");

            for(int i=1; i<visited.length; i++){
                if(map[s][i] ==1&& !visited[i]){
                    q.add(i);
                    visited[i]= true;
                }
            }
        }
    }
}