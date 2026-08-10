import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        
        int[] nums_of_days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31,30, 31, 30, 31};
        String[] day_of_week = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat","Sun"};
        int total_1=0, total_2=0;

        total_1 += d1;
        for(int i=1; i<m1; i++){
            total_1 += nums_of_days[i];
        }

        total_2 += d2;
        for(int i=1; i<m2; i++){
            total_2 += nums_of_days[i];
        }

        int gap = total_2-total_1; 
        System.out.println(day_of_week[(gap % 7 + 7) % 7]);
    }
}