import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.printf("%.3f\n",Math.round(a*1000)/1000.0);
        System.out.printf("%.3f\n",Math.round(b*1000)/1000.0);
        System.out.printf("%.3f\n",Math.round(c*1000)/1000.0);
    }
}