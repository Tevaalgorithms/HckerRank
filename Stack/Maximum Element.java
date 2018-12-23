import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
     public static void main(String[] args) 
     {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<Integer>();
        int max = 0;
        int max_count = 0;

        for (int i = 0; i < n ; i++) 
        {
            int j = 0;
            try 
            {
                j = sc.nextInt();
            } 
            catch (Exception ee) 
            {
                System.out.println(max);
                continue;
            }
            int k = 0;
            if (j == 1) 
            {
                k = sc.nextInt();
                st.push(k);
                if (k > max) 
                {
                    max = k;
                    max_count = 1;
                } 
                else if (k == max) 
                {
                    max_count++;
                }
            } 
            else if (j == 2) 
            {
                if (!(st.isEmpty()))
                {
                    k = st.pop();
                    if (k == max) 
                    {
                        max_count--;
                        if (max_count == 0) 
                        {
                            max =  0;
                            Iterator iter = st.iterator();
                            while (iter.hasNext()) 
                            {
                                int temp = (Integer) iter.next();
                                if (temp > max )
                                {
                                    max = temp;
                                    max_count = 1;
                                } 
                                else if (temp == max) 
                                {
                                    max_count++;
                                }
                            }
                        }
                    }
                }
            } 
            else if (j == 3) 
            {
                if (max != 0) System.out.println(max);
            }
        }
    }
}

// The following URL helps to understand the solution well. https://coderinme.com/maximum-element-hackerrank-problem-solution/
