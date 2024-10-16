import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            String str = i + "";
            int check = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '0' || str.charAt(j) == '5')
                    check++;
            }
            if (check == str.length()) {
                list.add(i);
            }
        }
        if (!list.isEmpty())
            return list.stream().mapToInt(i -> i).toArray();
        else
            return new int[]{-1};
    }

}