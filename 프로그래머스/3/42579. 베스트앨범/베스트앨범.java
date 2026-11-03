import java.util.*;
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        // 장르별 재생 숫자 구하기
        Map<String, Integer> play = new HashMap<>();
        for(int i=0; i<genres.length; i++){
            play.put(genres[i], play.getOrDefault(genres[i],0)+plays[i]);
           
        }
        
        List<String> genreList = new ArrayList<>(play.keySet());
        genreList.sort((a,b)->play.get(b)-play.get(a));
        
        List<Integer> answerList = new ArrayList<>();
        for(String g : genreList){
            List<int[]> songs = new ArrayList<>();
            for(int i=0; i<genres.length; i++){
                if(genres[i].equals(g))
                    songs.add(new int[]{i, plays[i]});
            }
            
            songs.sort((a,b)->{
                      if(a[1]==b[1])
                        return a[0]-b[0];
                      return b[1]-a[1];});
            
            for(int i=0; i<songs.size()&&i<2; i++){
                answerList.add(songs.get(i)[0]);
            }    
        }
        
        int[] anaswer = new int[answerList.size()];
        for(int i=0; i<answerList.size(); i++){
            anaswer[i] = answerList.get(i);
        }
        
        return anaswer;
    }
}