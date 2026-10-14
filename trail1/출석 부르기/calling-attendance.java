import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String name = "";
        if(num==1)
            name = "John";
        else if(num==2)
            name = "Tom";
        else if (num==3)
            name = "Paul";
        else 
            name = "Vacancy";
        System.out.println(name);
    }
}