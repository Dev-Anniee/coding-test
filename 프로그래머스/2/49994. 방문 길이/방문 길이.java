// U -> up
// D -> down
// R -> right
// L -> left

class Solution {
    public int solution(String dirs) {
        int answer = 0;
        int x =5, y=5;
        boolean[][][] graph = new boolean[11][11][4];
        for(int i =0; i<dirs.length(); i++){
            if(dirs.charAt(i)=='U'){
                if(y<10){
                    y++;
                    if(!graph[x][y][0]){
                        graph[x][y][0] = true;
                        graph[x][y-1][1] = true;
                        answer++;
                    }
                }
            }
            else if (dirs.charAt(i)=='D'){
                if(y>0){
                    y--;
                    if(!graph[x][y][1]){
                        graph[x][y][1] = true;
                        graph[x][y+1][0] = true;
                        answer++;
                    }
                }
            }
            else if (dirs.charAt(i)=='R'){
                if(x<10){
                    x++;
                    if(!graph[x][y][2]){
                        graph[x][y][2] = true;
                        graph[x-1][y][3] = true;
                        answer++;
                    }
                }
            }
            else{
                if(x>0){
                    x--;
                    if(!graph[x][y][3]){
                        graph[x][y][3]= true;
                        graph[x+1][y][2] = true;
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}