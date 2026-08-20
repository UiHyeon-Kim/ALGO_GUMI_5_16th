import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int o = N % P;

            long result = 1;

            for (int i = 0; i < P; i++) {
                if (i < o) {
                    result *=  N / P + 1;
                    continue;
                }

                result *= N / P;
            }

            sb.append('#')
                    .append(tc)
                    .append(' ')
                    .append(result)
                    .append('\n');
        }

        System.out.print(sb);
    }
}
