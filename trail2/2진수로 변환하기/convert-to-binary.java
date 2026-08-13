import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println(0);
            return;
        }

        int[] digits = new int[32];
        int cnt = 0;

        while (n > 0) {
            digits[cnt++] = n % 2;
            n /= 2;
        }

        for (int i = cnt - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
        
        System.out.println(); 
    }
}