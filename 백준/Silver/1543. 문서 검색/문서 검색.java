import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String condition = scanner.nextLine();
        String search = scanner.nextLine();
        int startIdx = 0;
        int cnt = 0;
        while (true) {
            int Idx = condition.indexOf(search, startIdx);
            if (Idx < 0)
                break;
            cnt++;
            startIdx = Idx + search.length();
        }
        System.out.println(cnt);
    }
}