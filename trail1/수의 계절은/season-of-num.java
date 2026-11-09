import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        if(3<=m && m<=5)
            System.out.println("Spring");
        else if(6<=m && m <=8)
            System.out.println("Summer");
        else if(9<=m && m<=11)
            System.out.println("Fall");
        else
            System.out.println("Winter");
    }
}