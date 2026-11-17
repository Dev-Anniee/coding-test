import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int count = 0;
        for(int i=0; i<3; i++){
            String s = sc.next();
            int t = sc.nextInt();

            if(s.charAt(0) == 'Y' && t >= 37)
                count++;
        }

        if(count>=2)
            System.out.println("E");
        else
            System.out.println("N");
    }
}