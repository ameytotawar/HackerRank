import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count[] = new int[100];
        for(int i=0; i<n; i++) {
            count[sc.nextInt()]++;
        }
        for(int c=0; c<100; c++) {
            for(int i=0; i<count[c]; i++) {
                System.out.print(c + " ");
            }
        }
        System.out.println("");
    }
}