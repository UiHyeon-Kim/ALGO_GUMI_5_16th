import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Solution {

    private static int[][] arr;
    private static Set<String> set;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            arr = new int[4][4];

            for (int i = 0; i < 4; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 4; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            set = new HashSet<>();

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    findRoute(i, j, new int[7], 0);
                }
            }

            sb.append('#')
                    .append(tc)
                    .append(' ')
                    .append(set.size())
                    .append('\n');
        }

        System.out.print(sb);
    }

    private static void findRoute(int sr, int sc, int[] curr, int depth) {
        if (depth == 7) {
            set.add(Arrays.toString(curr));
            return;
        }

        curr[depth] = arr[sr][sc];
        if (0 <= sr - 1) findRoute(sr - 1, sc, curr, depth + 1);
        if (0 <= sc - 1) findRoute(sr, sc - 1, curr, depth + 1);
        if (sr + 1 < 4) findRoute(sr + 1, sc, curr, depth + 1);
        if (sc + 1 < 4) findRoute(sr, sc + 1, curr, depth + 1);
    }
}
