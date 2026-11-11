import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        int n = phone_book.length;
        Arrays.sort(phone_book); // 관계를 가진 단어끼리 근접하게 두기
            
        for(int i=1; i<n; i++){
            if(phone_book[i].startsWith(phone_book[i-1]))
                return false;
        }
        
        return true;
    }
}