import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        /*ArrayList<ArrayList<String>> count = new ArrayList<ArrayList<String>>(100);
        for(int i=0; i<n/2; i++) {
            int key = sc.nextInt();
            String val = sc.next();
            count.get(key).add("-");
        }
        for(int i=n/2; i<n; i++) {
            int key = sc.nextInt();
            String val = sc.next();
            count.get(key).add(val);
        }
        for(int i=0; i<n; i++) {
            for(int j=0; j<count.get(i).size(); j++) {
                System.out.print(count.get(i).get(j) + " ");
            }
        }*/
        StringBuilder[] sb = new StringBuilder[100];
        for(int i=0; i<100; i++) {
            sb[i] = new StringBuilder("");
        }
        for(int i=0;i<n/2; i++) {
            sb[sc.nextInt()].append("- ");
            String str = sc.next();    
        }
        for(int i=n/2; i<n; i++) {
            sb[sc.nextInt()].append(sc.next() + " ");
        }
        for(int i=0; i<100; i++) {
            System.out.print(sb[i]);
        }
        System.out.println("");
    }
}