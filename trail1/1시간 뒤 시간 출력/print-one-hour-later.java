import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String t = sc.next();
        String[] tArr = t.split(":");
        int h = Integer.parseInt(tArr[0]);
        int m = Integer.parseInt(tArr[1]);
        System.out.println(h+1+":"+m);
    }
}