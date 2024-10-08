import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("%d is ", n);
        if(n%2==0)
            System.out.printf("even");
        else
            System.out.printf("odd");
    }
}