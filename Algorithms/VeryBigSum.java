import java.io.;
import java.util.;
import java.text.;
import java.math.;
import java.util.regex.;

public class Solution {

    static long aVeryBigSum(int n, long[] ar) {
         Complete this function
        long sum = 0;
        for(int i=0; in; i++)
        {
            sum = sum + ar[i];
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.readLine());
        String str = in.readLine();
        long[] ar = new long[n];
        String[] ars = str.split( );
        for(int ar_i = 0; ar_i  n; ar_i++){
            ar[ar_i] = Integer.parseInt(ars[ar_i]);
        }
        long result = aVeryBigSum(n, ar);
        System.out.println(result);
    }
}
