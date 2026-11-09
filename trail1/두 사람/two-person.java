import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a_age = sc.nextInt();
        String a_gender = sc.next();

        int b_age = sc.nextInt();
        String b_gender = sc.next();

        if((a_age >=19&& a_gender.equals("M")) || (b_age>=19&& b_gender.equals("M")))
            System.out.println(1);
        else
            System.out.println(0);
    }
}