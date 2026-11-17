import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(year%4 == 0){
            if (year%100 == 0 && year%400 != 0)
                System.out.println("false");

            else
               System.out.println("true");
        }     

        else
            System.out.println("false");
    }
}