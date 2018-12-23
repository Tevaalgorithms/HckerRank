import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    private static int minStackHeight(int[] heights) 
    {
        int maxHeight = Integer.MAX_VALUE;
        for(int i = 0; i < heights.length; i++) {
            maxHeight = Math.min(maxHeight, heights[i]);
        }
        return maxHeight;
    }

    private static boolean areAllElementsEqual(int[] heights) {
        int height = heights[0];
        for(int hTmp : heights) {
            if(height != hTmp) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException 
    {
       final Scanner in = new Scanner(System.in);
        
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        
        final int[][] stacks = {new int[n1], new int[n2], new int[n3]};
        final int[] heights = {0, 0, 0};
        final int[] indexes = {0, 0 ,0};
        
        for(int i = 0; i < stacks.length; i++) {
            for(int j = 0; j < stacks[i].length; j++) {
                stacks[i][j] = in.nextInt();
                heights[i] += stacks[i][j];
            }
        }
        
        int minHeight = minStackHeight(heights);
        
        while(!areAllElementsEqual(heights)) {
            for(int i = 0; i < stacks.length; i++) {
                if(heights[i] > minHeight) {
                    heights[i] -= stacks[i][indexes[i]++];
                    minHeight = Math.min(minHeight, heights[i]);
                }
            }
        }
        
        System.out.println(minHeight);
        
        in.close();
    }
}

Thanks to the following URL: http://www.allprogrammingtutorials.com/tutorials/equal-stacks-challenge.php
