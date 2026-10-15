import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        if(A% 2==1)
            A = A+3;
        if(A%3==0)
            A = A/3;

        System.out.println(A);
    }
}