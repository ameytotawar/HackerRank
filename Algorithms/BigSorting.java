import java.io.*;
import java.util.*;
/*import java.text.*;
import java.math.*;
import java.util.regex.*;*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(in.readLine());
        String[] unsorted = new String[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.readLine();
        }
        // your code goes here
        //Arrays.sort(unsorted);
        Arrays.sort(unsorted, (left, right) ->
        {
            /* If length of left != right, then return 
               the diff of the length else  use compareTo
               function to compare values.*/
            if (left.length() != right.length())
                return left.length() - right.length();
             return left.compareTo(right);
        });
        for(int sorted_i=0; sorted_i<n; sorted_i++)
        {
            out.write(unsorted[sorted_i] + "\n");
        }
        out.flush();
        out.close();
    }
}
