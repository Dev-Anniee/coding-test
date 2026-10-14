import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String word = "";

        if(A.equals("S"))
            word = "Superior";
        else if(A.equals("A"))
            word = "Excellent";
        else if(A.equals("B"))
            word ="Good";
        else if(A.equals("C"))
            word = "Usually";
        else if(A.equals("D"))
            word = "Effort";
        else 
            word = "Failure";

        System.out.println(word);
    }
}