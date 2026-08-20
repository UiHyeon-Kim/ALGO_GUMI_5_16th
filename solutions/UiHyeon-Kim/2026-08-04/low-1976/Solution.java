import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine().trim());
        for (int tc = 1; tc <= T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int h1 = Integer.parseInt(st.nextToken());
            int m1 = Integer.parseInt(st.nextToken());
            int h2 = Integer.parseInt(st.nextToken());
            int m2 = Integer.parseInt(st.nextToken());

            int m = m1 + m2;
            int h = h1 + h2;

            if (m >= 60) {
                h++;
                m %= 60;
            }
            if (h > 12) {
                h -= 12;
            }

            sb.append('#')
                    .append(tc)
                    .append(' ')
                    .append(h)
                    .append(' ')
                    .append(m)
                    .append('\n');
        }

        System.out.print(sb);
    }
}
