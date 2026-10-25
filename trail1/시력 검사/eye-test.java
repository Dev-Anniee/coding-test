import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        double left = sc.nextDouble();
        double right = sc.nextDouble();

        if(left >= 1.0 && right >=1.0)
            System.out.println("High");

        else if(left >= 0.5 && right >=0.5)
            System.out.println("Middle");
        
        else
            System.out.println("Low");
    }
}