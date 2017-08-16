import java.io.*;
import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;

public class Solution {
    
    private static List<List<Integer>> adj;
    private static boolean[] visited;
    private static int count;   
    
    private static long roadsAndLibraries(int x, int y) {
        long cost = 0;
        
        for (int i = 0; i < adj.size(); i++) {
            if (!visited[i]) {
                count = 0;
                dfs(i);
                if (x > y) {
                    cost += x + y * (count - 1);
                } else {
                    cost += x * count;
                }
            }
        }
        
        return cost;
    }
    
    private static void dfs(int i) {
        visited[i] = true;
        count++;
        
        List<Integer> list = adj.get(i);
        for (int j = 0; j < list.size(); j++) {
            if (!visited[list.get(j)]) {
                dfs(list.get(j));
            }
        }
    }

    public static void main(String[] args) throws IOException {
        //Scanner in = new Scanner(System.in);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int q = Integer.parseInt(in.readLine());
        for(int a0 = 0; a0 < q; a0++){
            String[] str = (in.readLine()).split(" ");
            int n = Integer.parseInt(str[0]);
            int m = Integer.parseInt(str[1]);
            int x = Integer.parseInt(str[2]);
            int y = Integer.parseInt(str[3]);
            
            adj = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                adj.add(new ArrayList<>());
            }
            visited = new boolean[n];
            
            for(int a1 = 0; a1 < m; a1++){
                String[] city = (in.readLine()).split(" ");
                int city_1 = Integer.parseInt(city[0]);
                int city_2 = Integer.parseInt(city[1]);
                adj.get(city_1 - 1).add(city_2 - 1);
                adj.get(city_2 - 1).add(city_1 - 1);
            }
            out.write(roadsAndLibraries(x, y) + "\n");
        }
        out.flush();
        out.close();
    }
}
