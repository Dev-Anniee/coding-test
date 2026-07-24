import java.util.*;

public class Main {
    static void printStar(int num){
        if (num==0)
            return;
        System.out.println("HelloWorld");
        printStar(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printStar(num);
    }
}