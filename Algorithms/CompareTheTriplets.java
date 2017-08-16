import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
//import java.lang.*;
/*import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;*/

public class Solution {

    static int[] solve(int arr[]){
        // Complete this function
        int[] res = new int[2];
        for(int i=0;i<3;i++)
        {
            if(arr[i]<arr[i+3])
                res[1]++;
            else if(arr[i]>arr[i+3])
                res[0]++;
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        /*Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();*/
        int[] arr = new int[6];
        //read first line
        String str = in.readLine();
        String[] stra = str.split(" ");
        for(int i=0;i<3;i++)
        {
            arr[i] = Integer.parseInt(stra[i]);
        }
        
        //int a1 = Integer.parseInt(stra[1]);
        //int a2 = Integer.parseInt(stra[2]);
        //read second line
        str = in.readLine();
        String[] strb = str.split(" ");
        for(int i=0;i<3;i++)
        {
            arr[i+3] = Integer.parseInt(strb[i]);
        }
        
        //int b1 = Integer.parseInt(strb[1]);
        //int b2 = Integer.parseInt(strb[2]);
        int[] result = solve(arr);
        for (int i = 0; i < result.length; i++) {
            out.write(result[i] + (i != result.length - 1 ? " " : ""));
        }
        //System.out.println("");
        out.flush();
        out.close();

    }
}
