class Solution {
    public int solution(int[][] jobs) {
        int n = jobs.length;
        boolean[] done = new boolean[n];
        
        int now =0;
        int total = 0;
        int count = 0;
        
        while(count<n){
            int selected =-1;
            for(int i=0; i<n; i++){
                if(done[i]==true)
                    continue;
                if(now<jobs[i][0])
                    continue;
                else if(selected==-1)
                    selected = i;
                else if(jobs[selected][1]>jobs[i][1])
                    selected = i;
            }
            if(selected ==-1){
                now++;
                continue;
            }
            now +=jobs[selected][1];
            done[selected] = true;
            total +=now-jobs[selected][0];
            count++;
        }
        return total/n;
    }
}