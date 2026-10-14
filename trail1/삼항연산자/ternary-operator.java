import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        String result = score == 100 ? "pass" : "failure";
        System.out.println(result);
    }
}