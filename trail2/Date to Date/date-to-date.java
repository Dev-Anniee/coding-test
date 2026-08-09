import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int[] num_of_days = new int[] {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // 1. 1월 1일부터 m1월 d1일까지의 총 일수
        int totalDays1 = d1;
        for (int i = 1; i < m1; i++) {
            totalDays1 += num_of_days[i];
        }

        // 2. 1월 1일부터 m2월 d2일까지의 총 일수
        int totalDays2 = d2;
        for (int i = 1; i < m2; i++) {
            totalDays2 += num_of_days[i];
        }

        // 3. 두 날짜의 차이 + 1 (시작일 포함)
        System.out.println(totalDays2 - totalDays1 + 1);
    }
}