import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        if (input == null) return;
        
        StringTokenizer st = new StringTokenizer(input);
        long H = Long.parseLong(st.nextToken());
        long S = Long.parseLong(st.nextToken());

        // 1. 실크 1개당 얻을 수 있는 추가 체력(G) 계산
        long G;
        if (H >= 5) {
            G = 3;
        } else if (H >= 3) {
            G = 2;
        } else {
            G = 0;
        }

        // 2. 전체 체력 합산 및 공격 횟수 계산
        // (H + G * S + 1) / 2 는 올림 계산과 동일함
        long totalHP = H + (G * S);
        long ans = (totalHP + 1) / 2;

        System.out.println(ans);
    }
}