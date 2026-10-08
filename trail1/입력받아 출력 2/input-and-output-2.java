import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        String[] numArr = num.split("-");
        System.out.println(numArr[0]+numArr[1]);
    }
}