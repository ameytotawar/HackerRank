import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        for(int i=0; i<n; i++) {
            ar[i] = sc.nextInt();
        }
        int p = ar[0];
        List<Integer> left = new ArrayList<Integer>();
        List<Integer> right = new ArrayList<Integer>();
        List<Integer> equal = new ArrayList<Integer>();
        equal.add(ar[0]);
        for(int i=1; i<n; i++) {
            if(ar[i]<p)
                left.add(ar[i]);
            else if(ar[i]>p)
                right.add(ar[i]);
            else
                equal.add(ar[i]);
        }
        List<Integer> all = new ArrayList<Integer>();
        all.addAll(left);
        all.addAll(equal);
        all.addAll(right);
        for(Integer a: all) {
            System.out.print(a + " ");
        }
        System.out.println("");
    }
}