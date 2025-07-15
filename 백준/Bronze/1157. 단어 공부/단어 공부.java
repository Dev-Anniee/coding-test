import java.util.Scanner;

public class Main {
    public static int[] getAlphabet(String word) {
        int[] count = new int[26];
        for (int i = 0; i < word.length(); i++) {
            if('A'<=word.charAt(i)&&word.charAt(i)<='Z'){
                count[word.charAt(i)-'A']++;
            }
            else if('a'<=word.charAt(i)&&word.charAt(i)<='z'){
                count[word.charAt(i)-'a']++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str =scanner.next(); //.toUpperCase()로 대문자 변환 후 진행할 수 있음
        int[] count =getAlphabet(str);

        int max = -1;
        char maxAlpha = '?';
        for(int i = 0; i < 26; i++){
            if(count[i]>max){
                max = count[i];
                maxAlpha = (char)('A'+i);
            }
            
            else if(count[i]==max){
                maxAlpha = '?';
            }
        }
        System.out.println(maxAlpha);
    }
}