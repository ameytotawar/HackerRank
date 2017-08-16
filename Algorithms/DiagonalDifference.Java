import java.io.*;
import java.util.*;
import java.lang.Math.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(in.readLine());
        //int[][] arr = new int[n][n];
        int a = 0, psum=0, ssum=0;
        while(a<n)
        {
            String str = in.readLine();
            String[] strr = str.split(" ");
            /*for(int i=0; i<n; i++)
            {
                arr[a][i] = Integer.parseInt(strr[i]);
            }*/
            psum += Integer.parseInt(strr[a]);
            ssum += Integer.parseInt(strr[n-1-a]);
            a++;
        }
        int result = Math.abs(psum-ssum);
        System.out.println(result);
        /*out.write(result);
        out.flush();
        out.close();*/
    }
}