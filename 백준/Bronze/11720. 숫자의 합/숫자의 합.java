import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum =0;
        String nums = sc.next();
        for(int i=0; i<num; i++){
            sum+=nums.charAt(i)-'0';
        }
        System.out.println(sum);
    }
}