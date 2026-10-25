class Solution {
    public int[] solution(String[] park, String[] routes) {
        
        int n = park.length;
        int m = park[0].length();
        
        //동서남북
        int[] dx = {1, -1, 0,0};
        int[] dy = {0, 0, 1,-1};
        
        int start_x = 0;
        int start_y = 0;
        
        for(int i=0; i<park.length;i++){
            for(int j=0; j<park[i].length(); j++){
                if(park[i].charAt(j) == 'S'){
                    start_x = j; 
                    start_y = i;
                }
            }
        }
        
        for(int i = 0; i<routes.length; i++){
            String[] parts = routes[i].split(" ");
            int num = Integer.parseInt(parts[1]);
            int nx= 0, ny=0;
            
            int prev_x = start_x;
            int prev_y = start_y;
            
            for(int j=0; j<num; j++){
                if(parts[0].equals("E")){
                    nx = start_x+dx[0];
                    ny = start_y+dy[0];
                }
                
                else if(parts[0].equals("W")){
                    nx = start_x+dx[1];
                    ny = start_y+dy[1];
                }
                
                else if(parts[0].equals("S")){
                    nx = start_x+dx[2];
                    ny = start_y+dy[2];
                }      
                
                else if(parts[0].equals("N")){
                    nx = start_x+dx[3];
                    ny = start_y+dy[3];
                }
                
                if(nx<0 || ny<0 || m<=nx || n<=ny || park[ny].charAt(nx) == 'X'){
                    start_x =prev_x;
                    start_y =prev_y;
                    break;
                }
                
                else{
                    start_x =nx;
                    start_y =ny;
                }

                
            }
        } return new int[]{start_y, start_x};
    }
}