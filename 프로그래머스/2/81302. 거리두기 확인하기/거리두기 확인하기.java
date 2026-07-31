class Solution {
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};

    public int[] solution(String[][] places) {
        int[] answer = new int[5];

        for (int i = 0; i < 5; i++) {
            answer[i] = checkDistance(places[i]);
        }
        
        return answer;
    }

    private int checkDistance(String[] place) {
        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 5; c++) {
                if (place[r].charAt(c) == 'P') {
                    for (int k = 0; k < 4; k++) {
                        int nr = r + dx[k];
                        int nc = c + dy[k];

                        if (nr < 0 || nr >= 5 || nc < 0 || nc >= 5) continue;
                        if (place[nr].charAt(nc) == 'P') return 0;
                        if (place[nr].charAt(nc) == 'O') {
                            for (int l = 0; l < 4; l++) {
                                int nnr = nr + dx[l];
                                int nnc = nc + dy[l];

                                if (nnr < 0 || nnr >= 5 || nnc < 0 || nnc >= 5) continue;
                                if (nnr == r && nnc == c) continue;
                                if (place[nnr].charAt(nnc) == 'P') return 0;
                            }
                        }
                    }
                }
            }
        }
        return 1;
    }
}