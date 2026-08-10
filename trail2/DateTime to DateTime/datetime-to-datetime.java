import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        int start = 11+ 60*11+ 24*60*11;
        int end = C+ 60*B+ 24*60*A;
        int answer = end-start;

        if(answer<0){
            System.out.println(-1);
            return;
        }
        System.out.println(answer);
    }
}