import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int[] num_of_days = new int[] {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (m1 == m2) {
            System.out.println(d2 - d1 + 1);
        } 

        else {
            int start = num_of_days[m1] - d1 + 1;
            int gap = 0;

            for (int i = m1 + 1; i < m2; i++) {
                gap += num_of_days[i];
            }

            int end = d2;
            System.out.println(start + gap + end);
        }
    }
}