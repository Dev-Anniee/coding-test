import java.util.ArrayList;
class Solution {
    public int[] solution(String myString) {
        ArrayList <Integer> list = new ArrayList<>();
        int cnt=0;
        int index=0;
        for(int i=0; i<myString.length(); i++){
            index++;
            if(myString.charAt(i)=='x'){
                list.add(index-1); index =0;
            }
        }
        if(index>0)
            list.add(index);
        else
            list.add(0);
        
        return list.stream().mapToInt(i->i).toArray();
    }
}