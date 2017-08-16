import java.io.*;
import java.util.*;

public class Solution {
    
    public static int BinarySearch(int arr[], int V, int start, int end) {
        int mid = (start + end) / 2;
        if(V > arr[mid]) {
            return BinarySearch(arr, V, mid+1, end);
        }
        else if(V < arr[mid]) {    
            return BinarySearch(arr, V, start, mid-1);
        }
        return mid;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int start=0, end = n-1;
        int index = BinarySearch(arr, V, start, end);
        System.out.println(index);
    }
}