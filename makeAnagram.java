import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) { 
       int[] counter1 = new int[26];
       int[] counter2 = new int[26];

       for(int i = 0; i < a.length(); i++)
       {
           counter1[a.charAt(i) - 'a']++;
       }

       for(int j = 0; j < b.length(); j++)
       {
           counter2[b.charAt(j) - 'a']++;
       }

        int result = 0;

        for (int i = 0; i < 26; i++)
            result += Math.abs(counter1[i] - counter2[i]);
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
