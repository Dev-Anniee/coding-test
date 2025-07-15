import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] chars = str.toCharArray();
        for(int i = 0; i < chars.length; i++){
            if('a'<=chars[i]&&chars[i]<='z')
                chars[i] -= 32;
            else if('A'<=chars[i]&&chars[i]<='Z')
                chars[i] += 32;
        }
        System.out.println(String.valueOf(chars));
    }
}