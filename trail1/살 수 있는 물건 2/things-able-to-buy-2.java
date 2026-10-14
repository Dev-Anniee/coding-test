import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String buy = "";
        if(N>=3000)
            buy = "book";
        else if(N>=1000)
            buy = "mask";
        else if(N>=500)
            buy = "pen";
        else
            buy = "no";
        System.out.println(buy);
    }
}