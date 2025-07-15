import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        // 문자열을 시간으로 바꾸는 방법1 -> int hour =(str1.charAt(0)-'0')*10+str1.charAt(1)-'0';
        // 문자열을 시간으로 바꾸는 방법2 -> int hour =Integer.parseInt(time.substring(0,2));
        // 문자열을 시간으로 바꾸는 방법3 ->
        String[] now = str1.split(":");
        int now_hour = Integer.parseInt(now[0]);
        int now_min = Integer.parseInt(now[1]);
        int now_sec = Integer.parseInt(now[2]);
        int now_amount = now_hour * 3600 + now_min * 60 + now_sec;


        String[] target = str2.split(":");
        int target_hour = Integer.parseInt(target[0]);
        int target_min = Integer.parseInt(target[1]);
        int target_sec = Integer.parseInt(target[2]);
        int target_amount = target_hour * 3600 + target_min * 60 + target_sec;

        int gap = target_amount-now_amount;
        if(gap<=0)
            gap+=24*3600; // 다음날까지 남은 시간으로 계산

        int gapHour = gap/3600;
        int gapMin = (gap%3600)/60;
        int gapSec = (gap%60);

        System.out.printf("%02d:%02d:%02d",gapHour,gapMin,gapSec);
    }
}