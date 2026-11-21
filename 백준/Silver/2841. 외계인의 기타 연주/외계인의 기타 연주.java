import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pTotal = sc.nextInt();

        Stack<Integer>[] st = new Stack[7];
        for(int i = 0; i<7; i++){
           st[i] = new Stack<Integer>();
        }

        int count = 0;
        for(int i=0; i<n; i++){
            int string = sc.nextInt();
            int pNum = sc.nextInt();

            //먼저 다 떼기 
            while(!st[string].isEmpty() && st[string].peek() > pNum){
                st[string].pop();
                count++;
            }

            //다 뗐으면 눌러야 할 손가락 누르
            if(st[string].isEmpty() || st[string].peek() < pNum) {
                st[string].push(pNum);
                count++;
            }
        }

        System.out.println(count);
    }
}