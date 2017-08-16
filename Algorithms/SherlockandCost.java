import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String args[] ) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(in.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(in.readLine());

            int[] b = new int [N];
            String[] str = in.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                b[j] = Integer.parseInt(str[j]);
            }

            long[][] dp = new long[2][N];
            for (int j = 1; j < N; j++) {
                dp[0][j] = Math.max(dp[0][j - 1] + Math.abs(b[j] - b[j - 1]),
                        dp[1][j - 1] + Math.abs(b[j] - 1));


                dp[1][j] = Math.max(dp[0][j - 1] + Math.abs(b[j - 1] - 1),
                        dp[1][j - 1] + Math.abs(1 - 1));
            }


            out.write(Math.max(dp[0][N - 1], dp[1][N - 1]) + "\n");
        }
        out.flush();
        out.close();

    }
}
