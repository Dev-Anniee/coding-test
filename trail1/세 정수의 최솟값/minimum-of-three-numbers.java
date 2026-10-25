import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int alpha[] = new int[3];
        int min = 101; 

        for(int i=0; i<3; i++){
            alpha[i] = sc.nextInt();
            if(min>alpha[i])
                min = alpha[i];
        }
        System.out.println(min);
    }
}