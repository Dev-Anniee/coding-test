import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String d = sc.next();
        String[] dArr = d.split("-");

        System.out.println(dArr[2]+"."+dArr[0]+"."+dArr[1]);
    }
}