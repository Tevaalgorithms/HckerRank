import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        ArrayList<Integer> apple_distance = new ArrayList<>();
        ArrayList<Integer> orange_distance = new ArrayList<>();
        
        // Calculate Apples Distance 
        for(int i=0; i < apples.length; i++)
        {            
           apple_distance.add(a + apples[i]);            
        }

         // Calculate Oranges Distance 
        for(int i=0; i < oranges.length; i++)
        {     
            orange_distance.add(b  + oranges[i]);          
        }      
        int total_apples = 0;
        for(int j = 0; j < apple_distance.size(); j++)
        {           
            if((apple_distance.get(j) >= s && apple_distance.get(j) < t)|| (apple_distance.get(j) <= t && apple_distance.get(j) > s))
            {
                total_apples += 1;
            }
        }

        System.out.print(total_apples + "\n");

        int total_oranges = 0;
        for(int j = 0; j < orange_distance.size(); j++)
        {            
            if((orange_distance.get(j) >= s && orange_distance.get(j) < t)|| (orange_distance.get(j) <= t && orange_distance.get(j) > s))
            {
                total_oranges += 1;
            }
        }

        System.out.print(total_oranges);


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] st = scanner.nextLine().split(" ");

        int s = Integer.parseInt(st[0]);

        int t = Integer.parseInt(st[1]);

        String[] ab = scanner.nextLine().split(" ");

        int a = Integer.parseInt(ab[0]);

        int b = Integer.parseInt(ab[1]);

        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        int[] apples = new int[m];

        String[] applesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int applesItem = Integer.parseInt(applesItems[i]);
            apples[i] = applesItem;
        }

        int[] oranges = new int[n];

        String[] orangesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int orangesItem = Integer.parseInt(orangesItems[i]);
            oranges[i] = orangesItem;
        }

        countApplesAndOranges(s, t, a, b, apples, oranges);

        scanner.close();
    }
}
