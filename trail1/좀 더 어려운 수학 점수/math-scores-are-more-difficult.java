import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a_math = sc.nextInt();
        int a_eng = sc.nextInt();

        int b_math = sc.nextInt();
        int b_eng = sc.nextInt();

        if(a_math>b_math)
            System.out.println("A");
            
        else if(a_math==b_math){
            if(a_eng>b_eng)
                System.out.println("A");
            else 
                System.out.println("B");
        }

        else 
                System.out.println("B");
    }
}