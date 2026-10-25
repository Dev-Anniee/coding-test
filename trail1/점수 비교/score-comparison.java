import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] A_score = new int[2];
        int[] B_score = new int[2];

        A_score[0] = sc.nextInt();
        A_score[1] = sc.nextInt();

        B_score[0] = sc.nextInt();
        B_score[1] = sc.nextInt();

        if(A_score[0] > B_score[0] && A_score[1] > B_score[1])
            System.out.println(1);

        else
            System.out.println(0);
    }
}