import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = 1;
        for(int i =0; i<num; i++){
            for(int j=0; j<num; j++){
                if(n>9)
                    n=1;
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }
    }
}