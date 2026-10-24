class Solution {
    public int[] solution(String[] park, String[] routes) {
        int n = park.length;
        int m = park[0].length();
        
        // 동서남북
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        
        int[] start = new int[2];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(park[i].charAt(j) == 'S'){
                    start[0] = i; // y좌표
                    start[1] = j; // x좌표
                }
            }
        }
        
        for(int i = 0; i < routes.length; i++){
            String[] parts = routes[i].split(" ");
            int f = Integer.parseInt(parts[1]);
            
            // 기존 위치를 보존하기 위해 nx, ny를 if문 밖에서 선언
            int nx = start[1];
            int ny = start[0];
            boolean canMove = true;
            
            // f칸만큼 한 칸씩 이동해보며 확인
            for(int step = 0; step < f; step++){
                if(parts[0].equals("E")){
                    nx += dx[0];
                    ny += dy[0]; 
                }
                else if(parts[0].equals("W")){
                    nx += dx[1];
                    ny += dy[1]; 
                }
                else if(parts[0].equals("S")){
                    nx += dx[2];
                    ny += dy[2]; 
                }
                else if(parts[0].equals("N")){
                    nx += dx[3];
                    ny += dy[3]; 
                }
                
                // 벗어나거나 장애물을 만나면 중단
                if(nx < 0 || ny < 0 || nx >= m || ny >= n || park[ny].charAt(nx) == 'X'){
                    canMove = false;
                    break;
                }
            }
            
            // 문제 없이 통과했다면 실제 위치 갱신
            if(canMove){
                start[1] = nx;
                start[0] = ny;
            }
        }
        
        return start; // 최종 결과 반환
    }
}