class Solution {
    public int[] solution(int n, String[] moves) {
        int x = 0, y = 0;
        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};
        String[] dir = {"R","D","L","U"};

        for(String move : moves){
            int nx =0; 
            int ny =0;

            for(int j=0; j<dir.length; j++){
                if(move.equals(dir[j])){
                    nx = x+dx[j];
                    ny = y+dy[j];
                    break;
                }
            }
            
            if(nx<0 || nx>=n || ny<0 || ny>=n)
                continue;

            x=nx; y=ny;
        }
        return new int[]{x+1, y+1};
    }
}
