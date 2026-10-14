import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();

        String con = "";
        if(a>=1.0)
            con = "High";
        
        else if(a>=0.5)
            con = "Middle";

        else
            con = "Low";

        System.out.println(con);
    }
}