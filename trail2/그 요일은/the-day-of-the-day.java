import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String A = sc.next();
        

        int[] days_of_month = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] week = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat","Sun"};

        int total_1 = d1;
        for(int i=0; i<m1; i++){
            total_1+=days_of_month[i];
        }

        int total_2 = d2;
        for(int i=0; i<m2; i++){
            total_2+=days_of_month[i];
        }
        int loc=0;
        for(int i=0; i<week.length; i++){
            if(week[i].equals(A))
                loc=i;
        }
        int diff = total_2 - total_1;

        System.out.println((diff - loc + 7) / 7);
    }
}